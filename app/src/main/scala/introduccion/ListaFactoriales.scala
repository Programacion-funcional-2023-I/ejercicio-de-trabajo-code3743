package introduccion


class ListaFactoriales {
    def objListaFactoriales(n : Int): List[BigInt] = {
        var listaFactoriales : List[BigInt] = List();
        val objFactorial: Factorial = new Factorial();
        for(i <- 0 until (n + 1)){
            listaFactoriales = listaFactoriales.appended(objFactorial.calculateFactorial(i));
        }
        return listaFactoriales;
    }
}
