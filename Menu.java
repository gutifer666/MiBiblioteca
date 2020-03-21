package mislibros;



class Menu {
    
    private byte select = -1;
    GestorIO gestorIO = new GestorIO();
    GestorFichero gestorFichero = new GestorFichero();
    
    public void mostrar() {
        
        while (select != 6) {
        
        System.out.println("Menú de opciones:");
	System.out.println();		
	System.out.println("1_Añadir libro a la biblioteca.");
	System.out.println("2_Eliminar libro de la biblioteca.");
	System.out.println("3_Buscar libro.");
	System.out.println("4_Listado de libros.");
	System.out.println("5_Filtrar por genero.");
	System.out.println("6_Salir.");
        System.out.println();
        System.out.println("Elije una opción:");
        
        select = gestorIO.inByte();
        
        switch (select) {
            
            case 1:
                    GestorFichero.addBook();
                    break;
            case 2:
                    GestorFichero.deleteBook();
                    break;
            case 3:
                    GestorFichero.searchBook();
                    break;
            case 4:
                    GestorFichero.listBooks();
                    break;
                
            case 5:
                    GestorFichero.filterBooks();
                    break;
            case 6:
                    System.out.println("Salir");
                    break;
            default:
                    System.out.println("Opción no reconocida.");
                    break;
			}
			

		     
            }
    }




 
    
    
}
