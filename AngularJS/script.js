angular.module("listaTelefonica", []);
angular.module("listaTelefonica").controller("listaTelefonicaCtrl", function ($scope, $http) {
  $scope.app= "Lista Telefonica";
  $scope.contatos=[];
  $scope.operadoras=[];

  var carregarContatos = function () {
    $http.get("http://localhost:3412/contatos").then(function (resposta) {
      $scope.contatos = resposta.data;
    }, function (resposta, status) {
      $scope.message = "Aconteceu um problema: " + resposta;
    });
  };

  var carregarOperadoras = function(){
    $http.get("http://localhost:3412/operadoras").then(function(resposta){
      $scope.operadoras = resposta.data;
    });
  };

  $scope.adicionarContato=function(contato){
    contato.data = new Date();
    $http.post("http://localhost:3412/contatos", contato).then(function(contato){
      delete $scope.contato.data;
      $scope.contatoForm.$setPristine();
      carregarContatos();
    });
  }
  $scope.excluirContatos=function(contatos){
    $scope.contatos=contatos.filter(function(contato){
      if(!contato.selecionado ) return contato;
    })
  };
  $scope.isContatoSelecionado= function(contatos){
    return contatos.some(function (contato){
      return contato.selecionado;
    });
  };
  $scope.ordenarPor= function(filtro){
    $scope.criterioDeOrdenacao = filtro;
    $scope.direcaoDaOrdenacao = !$scope.direcaoDaOrdenacao;
  };
  $scope.selecionado="selecionado";
  $scope.negrito="negrito";

  carregarContatos();
  carregarOperadoras();
});