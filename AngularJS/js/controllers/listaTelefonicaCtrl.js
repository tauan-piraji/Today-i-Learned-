angular.module("listaTelefonica").controller("listaTelefonicaCtrl", function ($scope, contatosAPI, operadorasAPI, serialGenerator) {
  $scope.app= "Lista Telefonica";
  $scope.contatos=[];
  $scope.operadoras=[];

  var carregarContatos = function () {
    contatosAPI.getContatos().then(function (resposta) {
      $scope.contatos = resposta.data;
    }, function (resposta, status) {
      $scope.message = "Aconteceu um problema: " + resposta.status;
    }); 
  };

  var carregarOperadoras = function(){
   operadorasAPI.getOperadoras().then(function(resposta){
      $scope.operadoras = resposta.data;
    });
  };

  $scope.adicionarContato=function(contato){
    contato.serial = serialGenerator.generate();
    contato.data = new Date();
    contatosAPI.saveContatos(contato).then(function(contato){
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