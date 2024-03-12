package ZOOLOGICO;

import ZOOLOGICO.ANIMALES.animal;
import ZOOLOGICO.ANIMALES.acuatico;
import ZOOLOGICO.ANIMALES.ave;
import ZOOLOGICO.ANIMALES.terrestre;
import ZOOLOGICO.HABITATS.acuaticos;
import ZOOLOGICO.HABITATS.terrestres;
import ZOOLOGICO.VISITANTES.TourAves;
import ZOOLOGICO.VISITANTES.TourMamiferos;
import ZOOLOGICO.VISITANTES.TourNiños;
import ZOOLOGICO.VISITANTES.QuioscoInteractivo;
import ZOOLOGICO.MANTENIMIENTO.Camara;
import ZOOLOGICO.MANTENIMIENTO.SensorMovimiento;
import ZOOLOGICO.MANTENIMIENTO.GestorMantenimiento;
import ZOOLOGICO.MANTENIMIENTO.TareaMantenimiento;
import ZOOLOGICO.RECURSOS.AdministracionRecursos;
import ZOOLOGICO.RECURSOS.Pedido;
import ZOOLOGICO.RECURSOS.Proveedor;
import ZOOLOGICO.RECURSOS.Recurso;

import java.util.Scanner;

import static java.lang.System.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        // Opciones relacionadas con los animales
        out.println("Bienvenidos al zoológico");
        out.println("=== Menú ===");

        out.println("1. Crear un animal");
        out.println("2. Crear un animal acuático");
        out.println("3. Crear un ave");
        out.println("4. Crear un animal terrestre");
        out.println("5. Realizar acciones de animales");
        out.println("6. Salir");

        int eleccion = scanner.nextInt();
        switch (eleccion) {
            case 1:
                // Crear un animal
                out.println("Ingresa el nombre del animal:");
                String nombreAnimal = scanner.next();
                animal animal = new animal();
                out.println("Animal creado: " + animal);
                break;
            case 2:
                // Crear un animal acuático
                out.println("Ingresa el nombre del animal acuático:");
                String nombreAnimalAcuatico = scanner.next();
                float aletas;
                float branquias;
                float escamas;
                String tipoDeAgua;
                out.println("Ingresa aletas :");
                aletas = scanner.nextFloat();
                out.println("Ingresa branquias :");
                branquias = scanner.nextFloat();
                out.println("Ingresa escamas:");
                escamas = scanner.nextFloat();
                out.println("Ingresa el tipo de agua (dulce/salada):");
                tipoDeAgua = scanner.next();
                acuatico animalAcuatico = new acuatico(nombreAnimalAcuatico, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true, aletas, branquias, escamas, tipoDeAgua);
                out.println("Animal acuático creado: " + animalAcuatico);
                break;
            case 3:
                // Crear un ave
                out.println("Ingresa el nombre del ave:");
                String nombreAve = scanner.next();
                float vuela;
                float pico;
                float plumaje;
                String tipoDeAve;
                out.println("Ingresa vuela (verdadero/falso):");
                vuela = scanner.nextFloat();
                out.println("Ingresa pico (verdadero/falso):");
                pico = scanner.nextFloat();
                out.println("Ingresa plumaje (verdadero/falso):");
                plumaje = scanner.nextFloat();
                out.println("Ingresa el tipo de aviario (jaula/aviario):");
                tipoDeAve = scanner.next();
                ave ave = new ave(nombreAve, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true, vuela, pico, plumaje, tipoDeAve);
                out.println("Ave creada: " + ave);
                break;
            case 4:
                // Crear un animal terrestre
                out.println("Ingresa el nombre del animal terrestre:");
                String nombreAnimalTerrestre = scanner.next();
                float patas;
                float cola;
                float pelaje;
                String tipoTerrestre;
                out.println("Ingresa patas :");
                patas = scanner.nextFloat();
                out.println("Ingresa cola :");
                cola = scanner.nextFloat();
                out.println("Ingresa pelaje :");
                pelaje = scanner.nextFloat();
                out.println("Ingresa el tipo de terreno (bosque/sabana):");
                tipoTerrestre = scanner.next();
                terrestre animalTerrestre = new terrestre(nombreAnimalTerrestre, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true, patas, cola, pelaje, tipoTerrestre);
                out.println("Animal terrestre creado: " + animalTerrestre);
                break;
            case 5:
                // Realizar acciones de animales
                out.println("1. Registrar alimentación");
                out.println("2. Registrar reproducción");
                out.println("3. Registrar cuidados");
                out.println("4. Registrar enfermedades");
                out.println("5. Registrar vacunas");
                out.println("6. Registrar hábitat");
                out.println("7. Registrar peso");
                out.println("8. Registrar altura");
                out.println("9. Registrar edad");
                out.println("10. Registrar color");
                out.println("11. Registrar raza");
                out.println("12. Registrar especie");
                out.println("13. Registrar nombre");
                out.println("14. Registrar sexo");
                out.println("15. Registrar tipo");
                out.println("16. Registrar ID");
                out.println("17. Registrar salud");
                out.println("18. Registrar comportamiento");
                out.println("19. Salir");

                int eleccionAccionAnimal = scanner.nextInt();
                switch (eleccionAccionAnimal) {
                    case 1:
                        //Registrar alimentacion
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 2:
                        //Registrar reproduccion
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 3:
                        //Registrar cuidados
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 4:
                        //Registrar enfermedades
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 5:
                        //Registrar vacunas
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 6:
                        //Registrar habitat
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 7:
                        //Registrar peso
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 8:
                        //Registrar altura
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 9:
                        //Registrar edad
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 10:
                        //Registrar color
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 11:

                        //Registrar raza
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 12:

                        //Registrar especie
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 13:

                        //Registrar nombre
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 14:

                        //Registrar sexo
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 15:

                        //Registrar tipo
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                    case 16:

                        //Registrar ID
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;


                    case 17:

                            //Registrar salud
                            out.println("Ingresa el nombre del animal:");
                            nombreAnimal = scanner.next();
                            // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                            animal = new animal();
                            out.println("Animal creado: " + animal);
                            break;

                    case 18:
                        //Registrar comportamiento
                        out.println("Ingresa el nombre del animal:");
                        nombreAnimal = scanner.next();
                        // Suponiendo que "Animal" es una clase que extiende de AnimalBase.
                        animal = new animal();
                        out.println("Animal creado: " + animal);
                        break;

                      case 19:
                        // Salir
                        break;
                    default:
                        out.println("Opción inválida.");
                }

                break;
        }




            // Opciones relacionadas con los hábitats

            System.out.println("1. Crear un hábitat");
            System.out.println("2. Realizar acciones en hábitats");
            System.out.println("3. Salir");



            int eleccionHabitat = scanner.nextInt();
            switch (eleccionHabitat) {
                case 1:
                    // Crear un hábitat
                    out.println("1. Crear un hábitat aviario");
                    out.println("2. Crear un hábitat acuático");
                    out.println("3. Crear un hábitat terrestre");
                    out.println("4. Salir");

                    int eleccionCrearHabitat = scanner.nextInt();
                    switch (eleccionCrearHabitat) {
                        case 1:
                            // Crear un aviario
                            out.println("Ingresa la temperatura del aviario:");
                            float temperaturaAviario = scanner.nextFloat();
                            out.println("Ingresa la humedad del aviario:");
                            float humedadAviario = scanner.nextFloat();
                            out.println("Ingresa la limpieza del aviario :");
                            float limpiezaAviario = scanner.nextFloat();
                            ZOOLOGICO.HABITATS.ave aviario = new ZOOLOGICO.HABITATS.ave(temperaturaAviario);
                            out.println("Hábitat aviario creado: " + aviario);
                            break;
                        case 2:
                            // Crear un hábitat acuático
                            out.println("Ingresa la temperatura del hábitat acuático:");
                            float temperaturaHabitatAcuatico = scanner.nextFloat();
                            out.println("Ingresa la humedad del hábitat acuático:");
                            float humedadHabitatAcuatico = scanner.nextFloat();
                            out.println("Ingresa la limpieza del hábitat acuático :");
                            float limpiezaHabitatAcuatico = scanner.nextFloat();
                            acuaticos habitatAcuatico = new acuaticos(temperaturaHabitatAcuatico, humedadHabitatAcuatico, limpiezaHabitatAcuatico);
                            out.println("Hábitat acuático creado: " + habitatAcuatico);
                            break;
                        case 3:
                            // Crear un hábitat terrestre
                            out.println("Ingresa la temperatura del hábitat terrestre:");
                            float temperaturaHabitatTerrestre = scanner.nextFloat();
                            out.println("Ingresa la humedad del hábitat terrestre:");
                            float humedadHabitatTerrestre = scanner.nextFloat();
                            out.println("Ingresa la limpieza del hábitat terrestre :");
                            float limpiezaHabitatTerrestre = scanner.nextFloat();
                            terrestres habitatTerrestre = new terrestres(temperaturaHabitatTerrestre, humedadHabitatTerrestre, limpiezaHabitatTerrestre);
                            out.println("Hábitat terrestre creado: " + habitatTerrestre);
                            break;
                        case 4:
                            // Salir
                            break;
                        default:
                            out.println("Opción inválida.");
                    }
                    break;
                case 2:
                    // Realizar acciones en hábitats
                    out.println("1. Monitorear un hábitat");
                    out.println("2. Salir");

                    int eleccionAccionHabitat = scanner.nextInt();
                    switch (eleccionAccionHabitat) {
                        case 1:
                            // Monitorear un hábitat
                            out.println("1. Monitorear un hábitat aviario");
                            out.println("2. Monitorear un hábitat acuático");
                            out.println("3. Monitorear un hábitat terrestre");
                            out.println("4. Salir");

                            int eleccionMonitorearHabitat = scanner.nextInt();
                            switch (eleccionMonitorearHabitat) {
                                case 1:
                                    // Monitorear un aviario
                                    out.println("Ingresa la temperatura del aviario:");
                                    float temperaturaAviarioAMonitorear = scanner.nextFloat();
                                    out.println("Ingresa la humedad del aviario:");
                                    float humedadAviarioAMonitorear = scanner.nextFloat();
                                    out.println("Ingresa la limpieza del aviario :");
                                    float limpiezaAviarioAMonitorear = scanner.nextFloat();
                                    ZOOLOGICO.HABITATS.ave aviarioAMonitorear = new ZOOLOGICO.HABITATS.ave(temperaturaAviarioAMonitorear, humedadAviarioAMonitorear, limpiezaAviarioAMonitorear);
                                    aviarioAMonitorear.toString();
                                    break;
                                case 2:
                                    // Monitorear un acuario
                                    out.println("Ingresa la temperatura del acuario:");
                                    float temperaturaAcuarioAMonitorear = scanner.nextFloat();
                                    out.println("Ingresa la salinidad del acuario:");
                                    float salinidadAcuarioAMonitorear = scanner.nextFloat();
                                    out.println("Ingresa la limpieza del acuario :");
                                    float limpiezaAcuarioAMonitorear = scanner.nextFloat();
                                    acuaticos acuarioAMonitorear = new acuaticos(temperaturaAcuarioAMonitorear, salinidadAcuarioAMonitorear, limpiezaAcuarioAMonitorear);
                                    acuarioAMonitorear.toString();
                                    break;
                                case 3:
                                    // Monitorear un terrario
                                    out.println("Ingresa la temperatura del terrario:");
                                    float temperaturaTerrarioAMonitorear = scanner.nextFloat();
                                    out.println("Ingresa la humedad del terrario:");
                                    float humedadTerrarioAMonitorear = scanner.nextFloat();
                                    out.println("Ingresa la limpieza del terrario :");
                                    boolean limpiezaTerrarioAMonitorear = scanner.nextBoolean();
                                    terrestres terrarioAMonitorear = new terrestres(temperaturaTerrarioAMonitorear, humedadTerrarioAMonitorear, limpiezaTerrarioAMonitorear);
                                    terrarioAMonitorear.toString();
                                    break;
                                default:
                                    out.println("Opción inválida.");
                            }
                            break;
                        case 2:
                            // Salir
                            break;
                        default:
                            out.println("Opción inválida.");
                    }
                    break;
                case 3:
                    // Salir
                    break;
                default:
                    out.println("Opción inválida.");
            }

            // Opciones relacionadas con los visitantes
            out.println("1. Crear un recorrido");
            out.println("2. Visitar el zoológico");
            out.println("3. Salir");

            int eleccionVisitante = scanner.nextInt();
            switch (eleccionVisitante) {
                case 1:
                    // Crear un recorrido
                    out.println("1. Crear un recorrido de aves");
                    out.println("2. Crear un recorrido de mamíferos");
                    out.println("3. Crear un recorrido para niños");
                    out.println("4. Salir");

                    int eleccionCrearRecorrido = scanner.nextInt();
                    switch (eleccionCrearRecorrido) {
                        case 1:
                            // Crear un recorrido de aves
                            TourAves recorridoAves = new TourAves();
                            out.println("Recorrido de aves creado: " + recorridoAves);
                            break;
                        case 2:
                            // Crear un recorrido de mamíferos
                            TourMamiferos recorridoMamiferos = new TourMamiferos();
                            out.println("Recorrido de mamíferos creado: " + recorridoMamiferos);
                            break;
                        case 3:
                            // Crear un recorrido para niños
                            TourNiños recorridoNiños = new TourNiños();
                            out.println("Recorrido para niños creado: " + recorridoNiños);
                            break;
                        case 4:
                            // Salir
                            break;
                        default:
                            out.println("Opción inválida.");
                    }
                    break;
                case 2:
                    // Visitar el zoológico
                    out.println("1. Seleccionar un recorrido");
                    out.println("2. Visitar el zoológico sin recorrido");
                    out.println("3. Salir");

                    int eleccionVisitarZoo = scanner.nextInt();
                    switch (eleccionVisitarZoo) {
                        case 1:
                            // Seleccionar un recorrido
                            out.println("1. Recorrido de aves");
                            out.println("2. Recorrido de mamíferos");
                            out.println("3. Recorrido para niños");
                            out.println("4. Salir");

                            int eleccionSeleccionarRecorrido = scanner.nextInt();
                            switch (eleccionSeleccionarRecorrido) {
                                case 1:
                                    // Recorrido de aves
                                    QuioscoInteractivo quioscoInteractivo = new QuioscoInteractivo();
                                    TourAves recorridoAvesInteractivo = new TourAves();
                                    quioscoInteractivo.seleccionarTour(recorridoAvesInteractivo);
                                    break;
                                case 2:
                                    // Recorrido de mamíferos
                                    QuioscoInteractivo quioscoInteractivoMamiferos = new QuioscoInteractivo();
                                    TourMamiferos recorridoMamiferosInteractivo = new TourMamiferos();
                                    quioscoInteractivoMamiferos.seleccionarTour(recorridoMamiferosInteractivo);
                                    break;
                                case 3:
                                    // Recorrido para niños
                                    QuioscoInteractivo quioscoInteractivoNiños = new QuioscoInteractivo();
                                    TourNiños recorridoNiñosInteractivo = new TourNiños();
                                    quioscoInteractivoNiños.seleccionarTour(recorridoNiñosInteractivo);
                                    break;
                                case 4:
                                    // Salir
                                    break;
                                default:
                                    out.println("Opción inválida.");
                            }
                            break;
                        case 2:
                            // Visitar el zoológico sin recorrido
                            out.println("Visitando el zoológico sin recorrido...");
                            break;
                        case 3:
                            // Salir
                            break;
                        default:
                            out.println("Opción inválida.");
                    }
                    break;
                case 3:
                    // Salir
                    break;
                default:
                    out.println("Opción inválida.");
            }

            // Opciones relacionadas con el mantenimiento
            out.println("1. Agregar una tarea de mantenimiento");
            out.println("2. Mostrar tareas de mantenimiento");
            out.println("3. Salir");

            int eleccionMantenimiento = scanner.nextInt();
            switch (eleccionMantenimiento) {
                case 1:
                    // Agregar una tarea de mantenimiento
                    out.println("Ingresa la descripción de la tarea:");
                    String descripcionTarea = scanner.next();
                    out.println("Ingresa el tipo de tarea (regular/urgente):");
                    String tipoTarea = scanner.next();
                    GestorMantenimiento gestorMantenimiento = new GestorMantenimiento();
                    TareaMantenimiento tareaMantenimiento = new TareaMantenimiento(descripcionTarea, tipoTarea);
                    gestorMantenimiento.agregarTarea(tareaMantenimiento);
                    out.println("Tarea de mantenimiento agregada: " + tareaMantenimiento);
                    break;
                case 2:
                    // Mostrar tareas de mantenimiento
                    out.println("Tareas de mantenimiento:");
                    GestorMantenimiento gestorMantenimientoMostrar = new GestorMantenimiento();
                    gestorMantenimientoMostrar.mostrarTareasPendientes();
                    break;
                case 3:
                    // Salir
                    break;
                default:
                    out.println("Opción inválida.");
            }

            // Opciones relacionadas con los recursos
            out.println("1. Agregar un recurso");
            out.println("2. Mostrar recursos");
            out.println("3. Crear una orden de compra");
            out.println("4. Agregar un proveedor");
            out.println("5. Salir");

            int eleccionRecurso = scanner.nextInt();
            switch (eleccionRecurso) {
                case 1:
                    // Agregar un recurso
                    out.println("Ingresa el nombre del recurso:");
                    String nombreRecurso = scanner.next();
                    out.println("Ingresa la cantidad del recurso:");
                    int cantidadRecurso = scanner.nextInt();
                    AdministracionRecursos administracionRecursos = new AdministracionRecursos();
                    Recurso recurso = new Recurso(nombreRecurso, cantidadRecurso);
                    administracionRecursos.agregarRecurso(recurso);
                    out.println("Recurso agregado: " + recurso);
                    break;
                case 2:
                    // Mostrar recursos
                    out.println("Recursos:");
                    out.println("Ingresa el nombre del recurso:");
                    int cantidadRecursoMostrar = scanner.nextInt();
                    out.println("Ingresa la cantidad del recurso:");
                    cantidadRecursoMostrar = scanner.nextInt();
                    AdministracionRecursos administracionRecursosMostrar = new AdministracionRecursos();
                    administracionRecursosMostrar.mostrarInventario();
                    break;
                case 3:
                    // Crear una orden de compra
                    out.println("Ingresa el nombre del recurso para ordenar:");
                    String nombreRecursoParaOrdenar = scanner.next();
                    out.println("Ingresa la cantidad del recurso para ordenar:");
                    int cantidadRecursoParaOrdenar = scanner.nextInt();
                    Pedido pedido = new Pedido();
                    Recurso recursoParaOrdenar = new Recurso(nombreRecursoParaOrdenar, cantidadRecursoParaOrdenar);
                    pedido.agregarItem(recursoParaOrdenar);
                    out.println("Orden de compra creada: " + pedido);
                    break;
                case 4:
                    // Agregar un proveedor
                    out.println("Ingresa el nombre del proveedor:");
                    String nombreProveedor = scanner.next();
                    out.println("Ingresa los recursos ofrecidos (separados por comas):");
                    String recursosOfrecidos = scanner.next();
                    String[] arrayRecursosOfrecidos = recursosOfrecidos.split(",");
                    Proveedor proveedor = new Proveedor(nombreProveedor);
                    for (String recursoOfrecido : arrayRecursosOfrecidos) {
                        proveedor.agregarRecursoOfrecido(recursoOfrecido.trim());
                    }
                    out.println("Proveedor agregado: " + proveedor);
                    break;
                case 5:
                    // Sal

                default:
                    out.println("Opción inválida.");
            }


            // Opciones relacionadas con la seguridad
            out.println("1. Agregar una cámara de seguridad");
            out.println("2. Agregar un sensor de movimiento");
            out.println("3. Salir");


            int eleccionSeguridad = scanner.nextInt();
            switch (eleccionSeguridad) {
                case 1:
                    out.println("Ingresa el nombre de la cámara de seguridad:");
                    int nombreCamara = scanner.nextInt(); // Ahora esto debería funcionar correctamente
                    Camara camara = new Camara(nombreCamara);
                    out.println("Cámara agregada: " + nombreCamara);
                    break;

                case 2:
                    out.println("Ingresa la ubicación del sensor de movimiento:");
                    String ubicacionSensor = scanner.next();
                    SensorMovimiento sensor = new SensorMovimiento(ubicacionSensor);
                    out.println("Sensor de movimiento agregado: " + ubicacionSensor);
                    break;

                case 3:
                    out.println("Saliendo de las opciones de seguridad...");
                    break;
                default:
                    out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

    }
}





