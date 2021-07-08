/*
 * Create the function factorial here
 */
function factorial(numero){
    let i;
    let resultado = 1;
    for( i = numero; i>0; i--){
        resultado = resultado * i;
    }
    return resultado;
    
    
}