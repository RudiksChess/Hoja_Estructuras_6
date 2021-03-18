public class FabricaDeHashbrowns{
    /**@param eleccion Se ingresa una elección de la implemetación que se quiere hacer
     * @return  arroja un objeto seleccionado.
     */
    public IMap<Integer,String> implementacion(int eleccion){
        if (eleccion==1){
            return new TreeMapImplementation<Integer,String>();
        }
        else if (eleccion==2){
            return  new LinkedHashListImplementation<Integer,String>();
        }

        else {
            return new HashMapImplementacion<Integer,String>();
        }


    }




}
