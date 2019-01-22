import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		int opcion;
		boolean raiz=false;
		JOptionPane.showMessageDialog(null,"Bienvenido/a al men� de Islandia");
		opcion=opcionMenu();

		String estaciones[]= {"Invierno","Primavera","Verano","Oto�o"};


		while(opcion!=11) {

			raiz=false;

			switch(opcion) {
			case 1:
				System.out.println("Capital...");
				break;
			case 2:
				System.out.println("Historia de Islandia...");
				break;
			case 3:

				break;
			case 7:
				imprimirMaxMin(estaciones);
				break;
			case 10:
				opcion=opcionMenu();
				raiz=true;
				break;
			}
			if (raiz==false) {
				opcion=opcionMenu();
			}

		}


		JOptionPane.showMessageDialog(null,"Has salido del programa");
	}

	public static int opcionMenu() {
		int eleccion=0,eligetemp=0,elige2=0,elige3=0;
		boolean error=false;

		String[] opciones = {"Informaci�n general", "Historia", "Temperatura para 2019","Rutas tur�sticas","Presupuesto","Salir" };
		int opcion = JOptionPane.showOptionDialog(
				null                                       //componente
				, "�Qu� quieres saber sobre Islandia?"    // Mensaje
				, "Men� Islandia"                        // Titulo en la barra del cuadro
				, JOptionPane.DEFAULT_OPTION            // Tipo de opciones
				, JOptionPane.QUESTION_MESSAGE         // Tipo de mensaje (icono)
				, null                                // Icono (ninguno)
				, opciones                           // Opciones personalizadas
				, null                              // Opcion por defecto
				);

		//	JOptionPane.showMessageDialog(null, "Ha escogido "+opciones[opcion]);

		switch(opciones [opcion]) {
		case "Informaci�n general":
			eleccion=1;
			break;

		case "Historia":
			eleccion=2;
			break;

		case "Temperatura para 2019":

			do {
				error=false;
				try{
					eligetemp=Integer.parseInt(JOptionPane.showInputDialog("Elige el n�mero del apartado que quieras tratar: \n1) Previsi�n temperatura media para Invierno 2019"
							+ "\n2) Previsi�n temperatura media para Primavera 2019\n3) Previsi�n temperatura media para Verano 2019\n4) Previsi�n temperatura media para Oto�o 2019"
							+ "\n5) Previsi�n todas las m�ximas y m�nimas para todas las estaciones\n6) Volver al men� ra�z "));
				}catch (Exception e){
					error=true;
					JOptionPane.showMessageDialog(null,"Opci�n no v�lida. Tienes que introducir un n�mero");
				}
				if((eligetemp<1 || eligetemp>6) && error==false ) {
					JOptionPane.showMessageDialog(null,"El n�mero debe ser 1,2,3,4,5 � 6");
				}

			}while(eligetemp<1 || eligetemp>6 || error);


			switch(eligetemp) {
			case 1:
				eligetemp=3;
				break;
			case 2:
				eligetemp=4;
				break;
			case 3:
				eligetemp=5;
				break;
			case 4:
				eligetemp=6;
				break;
			case 5:
				eligetemp=7;
				break;
			default:
				eligetemp=10;
				break;
			}
			break;

		case "Rutas tur�sticas":
			do {

				error=false;
				try{
					elige2=Integer.parseInt(JOptionPane.showInputDialog("Elige el n�mero del apartado que quieras tratar: \n1) Rutas NATURALEZA"
							+ "\n2) Rutas CIUDADES"));
				}catch (Exception e){
					error=true;
					JOptionPane.showMessageDialog(null,"Opci�n no v�lida. Tienes que introducir un n�mero");
				}
				if((elige2<1 || elige2>2) && error==false ) {
					JOptionPane.showMessageDialog(null,"El n�mero debe ser 1 � 2");
				}

			}while(elige2<1 || elige2>2 || error);
			break;

		case "Presupuesto":

			break;
		default:
			eleccion=11;
			break;
		}
		return eleccion;

	}

	public static void imprimirMaxMin(String estaciones[]) {
		
		
		System.out.println("hola"+estaciones[1]);
	}


}
