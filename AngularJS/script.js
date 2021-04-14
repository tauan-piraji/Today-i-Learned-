angular.module("listaTelefonica", []);
angular.module("listaTelefonica").controller("listaTelefonicaCtrl", function ($scope) {
  $scope.app= "Lista Telefonica";
  $scope.contatos=[
    {nome: "Tauan", telefone: "9999-98888", data: new Date(), operadora:{nome: "Vivo", codigo: 15, categoria: "Celular", preco: 1}},
    {nome: "Pedrexxx", telefone: "99889-7988", data: new Date(), operadora:{nome: "Tim", codigo: 41, categoria: "Celular", preco: 3}},
    {nome: "Brunera", telefone: "77774-8888", data: new Date(), operadora:{nome: "Oi", codigo: 14, categoria: "Celular", preco: 2}},
    {nome: "Aline", telefone: "85474-8888", data: new Date(), operadora:{nome: "Oi", codigo: 14, categoria: "Celular", preco: 2}},
    {nome: "Hugo", telefone: "94477-7988", data: new Date(), operadora:{nome: "Tim", codigo: 41, categoria: "Celular", preco: 3}},
    {nome: "Victor", telefone: "9999-8774", data: new Date(), operadora:{nome: "Vivo", codigo: 15, categoria: "Celular", preco: 1}}
  ];
  $scope.operadoras=[
    {nome: "Oi", codigo: 14, categoria: "Celular", preco: 2},
    {nome: "Vivo", codigo: 15, categoria: "Celular", preco: 1},
    {nome: "Tim", codigo: 41, categoria: "Celular", preco: 3},
    {nome: "GVT", codigo: 25, categoria: "Fixo", preco: 1},
    {nome: "Embratel", codigo: 21, categoria: "Fixo", preco: 2}
  ];
  $scope.adicionarContato=function(contato){
    $scope.contatos.push(angular.copy(contato));
    delete $scope.contato;
    $scope.contatoForm.$setPristine();
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
});