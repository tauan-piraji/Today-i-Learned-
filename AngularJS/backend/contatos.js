var express = require('express');
var app = express();

app.use(express.static(__dirname + '/public'));
app.use(express.bodyParser());

var contatos = [
	{nome: "Bruna", telefone: "9999-2222", data: new Date(), operadora: {nome: "Oi", codigo: 14, categoria: "Celular", preco: 2}},
	{nome: "Sandra", telefone: "9999-3333", data: new Date(), operadora: {nome: "Vivo", codigo: 15, categoria: "Celular", preco: 1}},
	{nome: "Mariana", telefone: "9999-9999", data: new Date(), operadora: {nome: "Tim", codigo: 41, categoria: "Celular", preco: 3}},
  {nome: "Tauan", telefone: "9999-98888", data: new Date(), operadora:{nome: "Vivo", codigo: 15, categoria: "Celular", preco: 1}},
  {nome: "Pedrexxx", telefone: "99889-7988", data: new Date(), operadora:{nome: "Tim", codigo: 41, categoria: "Celular", preco: 3}},
  {nome: "Brunera", telefone: "77774-8888", data: new Date(), operadora:{nome: "Oi", codigo: 14, categoria: "Celular", preco: 2}},
  {nome: "Aline", telefone: "85474-8888", data: new Date(), operadora:{nome: "Oi", codigo: 14, categoria: "Celular", preco: 2}},
  {nome: "Hugo", telefone: "94477-7988", data: new Date(), operadora:{nome: "Tim", codigo: 41, categoria: "Celular", preco: 3}},
  {nome: "Licy", telefone: "94557-7988", data: new Date(), operadora:{nome: "Tim", codigo: 41, categoria: "Celular", preco: 3}},
  {nome: "Victor", telefone: "9999-8774", data: new Date(), operadora:{nome: "Vivo", codigo: 15, categoria: "Celular", preco: 1}}
];
var operadoras = [
	{nome: "Oi", codigo: 14, categoria: "Celular", preco: 2},
	{nome: "Vivo", codigo: 15, categoria: "Celular", preco: 1},
	{nome: "Tim", codigo: 41, categoria: "Celular", preco: 3},
	{nome: "GVT", codigo: 25, categoria: "Fixo", preco: 1},
	{nome: "Embratel", codigo: 21, categoria: "Fixo", preco: 2}
];

app.listen(process.env.PORT || 3412);//3412

app.all('*', function(req, res, next) {
  res.header('Access-Control-Allow-Origin', '*');
  res.header('Access-Control-Allow-Methods', 'PUT, GET, POST, DELETE, OPTIONS');
  res.header('Access-Control-Allow-Headers', 'Content-Type');
  next();
});

app.get('/contatos', function(req, res) {
  res.json(contatos);
});

app.post('/contatos', function(req, res) {
  contatos.push(req.body);
  res.json(true);
});

app.get('/operadoras', function(req, res) {
  res.json(operadoras);
});
