/**
 * 
 */

function voltarMenu() {
	window.location = "contato.jsp";
}

function acessarCadastro() {
	window.location = "cadastrarContato.jsp";
}

function alo() {
	alert('hello world');
}

function maskTelefone(o, f) {
	v_obj = o
	v_fun = f
	setTimeout("execmascara()", 1)
}
function execmascara() {
	v_obj.value = v_fun(v_obj.value)
}
function mtel(v) {
	v = v.replace(/\D/g, ""); // Remove tudo o que não é dígito
	v = v.replace(/^(\d{2})(\d)/g, "($1) $2"); // Coloca parênteses em volta
												// dos dois primeiros dígitos
	v = v.replace(/(\d)(\d{4})$/, "$1-$2"); // Coloca hífen entre o quarto e o
											// quinto dígitos
	return v;
}

function cadastrado() {
	alert("Contado Salvo");
}



function soNumeros(v){
	return v.replace(/\D/g,"")
}


function mascaraData(campoData){
           var data = campoData.value;
           if (data.length == 2){
               data = data + '/';
               document.forms[0].data.value = data;
   return true;              
           }
           if (data.length == 5){
               data = data + '/';
               document.forms[0].data.value = data;
               return true;
           }
      }












