package introduccion

import javax.naming.OperationNotSupportedException

class EjercicioListas {
  /*
  * Punto 2 repetir lista
  * @param lista Lista a repetir
  * @param n Número de veces a repetir la lista
  * @return Lista repetida n veces
  * @example repetirLista(List(1, 2, 3), 2) = List(List(1,1),List(2,2),List(3,3))
  * @throws IllegalArgumentException si n es negativo
  */
 def repetirListas(lista: List[Int], n: Int): List[List[Int]] = {
  var listaRepetida: List[List[Int]] = List();
  if (n < 0) throw  new IllegalArgumentException("N no debe ser negativo");
  for (i <- 0 until lista.length) {
    var listaTemp: List[Int] = List();
    for (j <- 0 until n) {
      listaTemp = listaTemp.appended(lista(i));
    }
    listaRepetida = listaRepetida.appended(listaTemp);
  }
  return listaRepetida;
}
  /*
  * Punto 3: Filtrar listas
  * @param criterioIn Criterio de filtrado que puede ser "mayor", "menor", "mayoroigual", "igual", "diferente" o "menoroigual"
  * @param n Número a comparar
  * @param lista Lista a filtrar
  * @return Lista filtrada de acuerdo al criterio y n
  * @throws IllegalArgumentException si el criterio no es uno de los valores válidos
  */

  def filtrarListas(criterioIn: String, n: Int, lista: List[Int]): List[Int] = {
   var criterio: String = criterioIn.toLowerCase();
   val filtro: Map[String, List[Int]] = Map(
     "mayor" -> lista.filter(elemento => elemento > n),
     "menor" -> lista.filter(elemento => elemento < n),
     "mayoroigual" -> lista.filter(elemento => elemento >= n),
     "igual" -> lista.filter(elemento => elemento == n),
     "diferente" -> lista.filter(elemento => elemento != n),
     "menoroigual" -> lista.filter(elemento => elemento <= n)
   );
   if (!filtro.contains(criterio))
     throw new IllegalArgumentException(
       "El criterio no es uno de los valores válidos"
     );
   return filtro.getOrElse(criterio, List());
}
}
