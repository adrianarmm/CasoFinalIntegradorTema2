import ZOOLOGICO.ANIMALES.animal;
import ZOOLOGICO.ANIMALES.acuatico;
import ZOOLOGICO.ANIMALES.ave;
import ZOOLOGICO.ANIMALES.terrestre;
as HabitatAve;
import ZOOLOGICO.HABITATS.acuaticos as HabitatAcuaticos;
import ZOOLOGICO.HABITATS.terrestres as HabitatTerrestres;
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

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Opciones relacionadas con los animales
        System.out.println("1. Crear un animal");
        System.out.println("2. Crear un animal acuático");
        System.out.println("3. Crear un ave");
        System.out.println("4. Crear un animal terrestre");
        System.out.println("5. Realizar acciones de animales");
        System.out.println("6. Salir");

        int eleccion = scanner.nextInt();
        switch (eleccion) {
            case 1:
                // Crear un animal
                System.out.println("Ingresa el nombre del animal:");
                String nombreAnimal = scanner.next();
                animal animal = new animal(nombreAnimal, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true);
                System.out.println("Animal creado: " + animal);
                break;
            case 2:
                // Crear un animal acuático
                System.out.println("Ingresa el nombre del animal acuático:");
                String nombreAnimalAcuatico = scanner.next();
                boolean aletas, branquias, escamas;
                String tipoDeAgua;
                System.out.println("Ingresa aletas (verdadero/falso):");
                aletas = scanner.nextBoolean();
                System.out.println("Ingresa branquias (verdadero/falso):");
                branquias = scanner.nextBoolean();
                System.out.println("Ingresa escamas (verdadero/falso):");
                escamas = scanner.nextBoolean();
                System.out.println("Ingresa el tipo de agua (dulce/salada):");
                tipoDeAgua = scanner.next();
                acuatico animalAcuatico = new acuatico(nombreAnimalAcuatico, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true, aletas, branquias, escamas, tipoDeAgua);
                System.out.println("Animal acuático creado: " + animalAcuatico);
                break;
            case 3:
                // Crear un ave
                System.out.println("Ingresa el nombre del ave:");
                String nombreAve = scanner.next();
                boolean vuela, pico, plumaje;
                String tipoDeAve;
                System.out.println("Ingresa vuela (verdadero/falso):");
                vuela = scanner.nextBoolean();
                System.out.println("Ingresa pico (verdadero/falso):");
                pico = scanner.nextBoolean();
                System.out.println("Ingresa plumaje (verdadero/falso):");
                plumaje = scanner.nextBoolean();
                System.out.println("Ingresa el tipo de aviario (jaula/aviario):");
                tipoDeAve = scanner.next();
                ave ave = new ave(nombreAve, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true, vuela, pico, plumaje, tipoDeAve);
                System.out.println("Ave creada: " + ave);
                break;
            case 4:
                // Crear un animal terrestre
                System.out.println("Ingresa el nombre del animal terrestre:");
                String nombreAnimalTerrestre = scanner.next();
                boolean patas, cola, pelaje;
                String tipoTerrestre;
                System.out.println("Ingresa patas (verdadero/falso):");
                patas = scanner.nextBoolean();
                System.out.println("Ingresa cola (verdadero/falso):");
                cola = scanner.nextBoolean();
                System.out.println("Ingresa pelaje (verdadero/falso):");
                pelaje = scanner.nextBoolean();
                System.out.println("Ingresa el tipo de terreno (bosque/sabana):");
                tipoTerrestre = scanner.next();
                terrestre animalTerrestre = new terrestre(nombreAnimalTerrestre, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true, patas, cola, pelaje, tipoTerrestre);
                System.out.println("Animal terrestre creado: " + animalTerrestre);
                break;
            case 5:
                // Realizar acciones de animales
                System.out.println("1. Registrar alimentación");
                System.out.println("2. Registrar reproducción");
                System.out.println("3. Registrar cuidados");
                System.out.println("4. Registrar enfermedades");
                System.out.println("5. Registrar vacunas");
                System.out.println("6. Registrar hábitat");
                System.out.println("7. Registrar peso");
                System.out.println("8. Registrar altura");
                System.out.println("9. Registrar edad");
                System.out.println("10. Registrar color");
                System.out.println("11. Registrar raza");
                System.out.println("12. Registrar especie");
                System.out.println("13. Registrar nombre");
                System.out.println("14. Registrar sexo");
                System.out.println("15. Registrar tipo");
                System.out.println("16. Registrar ID");
                System.out.println("17. Registrar salud");
                System.out.println("18. Registrar comportamiento");
                System.out.println("19. Salir");

                int eleccionAccionAnimal = scanner.nextInt();
                switch (eleccionAccionAnimal) {
                    case 1:
                        // Registrar alimentación
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaAlimentacion = scanner.next();
                        System.out.println("Ingresa la alimentación:");
                        String alimentacion = scanner.next();
                        // Encontrar el animal y registrar la alimentación
                        break;
                    case 2:
                        // Registrar reproducción
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaReproduccion = scanner.next();
                        System.out.println("Ingresa la reproducción:");
                        String reproduccion = scanner.next();
                        // Encontrar el animal y registrar la reproducción
                        break;
                    case 3:
                        // Registrar cuidados
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaCuidados = scanner.next();
                        System.out.println("Ingresa los cuidados:");
                        String cuidados = scanner.next();
                        // Encontrar el animal y registrar los cuidados
                        break;
                    case 4:
                        // Registrar enfermedades
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaEnfermedades = scanner.next();
                        System.out.println("Ingresa las enfermedades:");
                        String enfermedades = scanner.next();
                        // Encontrar el animal y registrar las enfermedades
                        break;
                    case 5:
                        // Registrar vacunas
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaVacunas = scanner.next();
                        System.out.println("Ingresa las vacunas:");
                        String vacunas = scanner.next();
                        // Encontrar el animal y registrar las vacunas
                        break;
                    case 6:
                        // Registrar hábitat
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaHabitat = scanner.next();
                        System.out.println("Ingresa el hábitat:");
                        String habitat = scanner.next();
                        // Encontrar el animal y registrar el hábitat
                        break;
                    case 7:
                        // Registrar peso
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaPeso = scanner.next();
                        System.out.println("Ingresa el peso:");
                        String peso = scanner.next();
                        // Encontrar el animal y registrar el peso
                        break;
                    case 8:
                        // Registrar altura
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaAltura = scanner.next();
                        System.out.println("Ingresa la altura:");
                        String altura = scanner.next();
                        // Encontrar el animal y registrar la altura
                        break;
                    case 9:
                        // Registrar edad
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaEdad = scanner.next();
                        System.out.println("Ingresa la edad:");
                        String edad = scanner.next();
                        // Encontrar el animal y registrar la edad
                        break;
                    case 10:
                        // Registrar color
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaColor = scanner.next();
                        System.out.println("Ingresa el color:");
                        String color = scanner.next();
                        // Encontrar el animal y registrar el color
                        break;
                    case 11:
                        // Registrar raza
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaRaza = scanner.next();
                        System.out.println("Ingresa la raza:");
                        String raza = scanner.next();
                        // Encontrar el animal y registrar la raza
                        break;
                    case 12:
                        // Registrar especie
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaEspecie = scanner.next();
                        System.out.println("Ingresa la especie:");
                        String especie = scanner.next();
                        // Encontrar el animal y registrar la especie
                        break;
                    case 13:
                        // Registrar nombre
                        System.out.println("Ingresa el nombre actual del animal:");
                        String animalParaNombre = scanner.next();
                        System.out.println("Ingresa el nuevo nombre:");
                        String nombre = scanner.next();
                        // Encontrar el animal y registrar el nuevo nombre
                        break;
                    case 14:
                        // Registrar sexo
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaSexo = scanner.next();
                        System.out.println("Ingresa el sexo:");
                        String sexo = scanner.next();
                        // Encontrar el animal y registrar el sexo
                        break;
                    case 15:
                        // Registrar tipo
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaTipo = scanner.next();
                        System.out.println("Ingresa el tipo:");
                        String tipo = scanner.next();
                        // Encontrar el animal y registrar el tipo
                        break;
                    case 16:
                        // Registrar ID
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaId = scanner.next();
                        System.out.println("Ingresa el ID:");
                        int id = scanner.nextInt();
                        // Encontrar el animal y registrar el ID
                        break;
                    case 17:
                        // Registrar salud
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaSalud = scanner.next();
                        System.out.println("Ingresa la salud (verdadero/falso):");
                        boolean salud = scanner.nextBoolean();
                        // Encontrar el animal y registrar la salud
                        break;
                    case 18:
                        // Registrar comportamiento
                        System.out.println("Ingresa el nombre del animal:");
                        String animalParaComportamiento = scanner.next();
                        System.out.println("Ingresa el comportamiento (verdadero/falso):");
                        boolean comportamiento = scanner.nextBoolean();
                        // Encontrar el animal y registrar el comportamiento
                        break;
                    case 19:
                        // Salir
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
                break;
            case 6:
                // Salir
                break;
            default:
                System.out.println("Opción inválida.");
        }

        // Opciones relacionadas con los hábitats
        System.out.println("1. Crear un hábitat");
        System.out.println("2. Realizar acciones en hábitats");
        System.out.println("3. Salir");

        int eleccionHabitat = scanner.nextInt();
        switch (eleccionHabitat) {
            case 1:
                // Crear un hábitat
                System.out.println("1. Crear un aviario");
                System.out.println("2. Crear un hábitat acuático");
                System.out.println("3. Crear un hábitat terrestre");
                System.out.println("4. Salir");

                int eleccionCrearHabitat = scanner.nextInt();
                switch (eleccionCrearHabitat) {
                    case 1:
                        // Crear un aviario
                        System.out.println("Ingresa la temperatura del aviario:");
                        float temperaturaAviario = scanner.nextFloat();
                        System.out.println("Ingresa la humedad del aviario:");
                        float humedadAviario = scanner.nextFloat();
                        System.out.println("Ingresa la limpieza del aviario (verdadero/falso):");
                        boolean limpiezaAviario = scanner.nextBoolean();
                        ZOOLOGICO.HABITATS.ave aviario = new ZOOLOGICO.HABITATS.ave(temperaturaAviario, humedadAviario, limpiezaAviario);
                        System.out.println("Aviario creado: " + aviario);
                        break;
                    case 2:
                        // Crear un hábitat acuático
                        System.out.println("Ingresa la temperatura del hábitat acuático:");
                        float temperaturaHabitatAcuatico = scanner.nextFloat();
                        System.out.println("Ingresa la humedad del hábitat acuático:");
                        float humedadHabitatAcuatico = scanner.nextFloat();
                        System.out.println("Ingresa la limpieza del hábitat acuático (verdadero/falso):");
                        boolean limpiezaHabitatAcuatico = scanner.nextBoolean();
                        acuaticos habitatAcuatico = new acuaticos(temperaturaHabitatAcuatico, humedadHabitatAcuatico, limpiezaHabitatAcuatico);
                        System.out.println("Hábitat acuático creado: " + habitatAcuatico);
                        break;
                    case 3:
                        // Crear un hábitat terrestre
                        System.out.println("Ingresa la temperatura del hábitat terrestre:");
                        float temperaturaHabitatTerrestre = scanner.nextFloat();
                        System.out.println("Ingresa la humedad del hábitat terrestre:");
                        float humedadHabitatTerrestre = scanner.nextFloat();
                        System.out.println("Ingresa la limpieza del hábitat terrestre (verdadero/falso):");
                        boolean limpiezaHabitatTerrestre = scanner.nextBoolean();
                        terrestres habitatTerrestre = new terrestres(temperaturaHabitatTerrestre, humedadHabitatTerrestre, limpiezaHabitatTerrestre);
                        System.out.println("Hábitat terrestre creado: " + habitatTerrestre);
                        break;
                    case 4:
                        // Salir
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
                break;
            case 2:
                // Realizar acciones en hábitats
                System.out.println("1. Monitorear un hábitat");
                System.out.println("2. Salir");

                int eleccionAccionHabitat = scanner.nextInt();
                switch (eleccionAccionHabitat) {
                    case 1:
                        // Monitorear un hábitat
                        System.out.println("1. Monitorear un aviario");
                        System.out.println("2. Monitorear un hábitat acuático");
                        System.out.println("3. Monitorear un hábitat terrestre");
                        System.out.println("4. Salir");

                        int eleccionMonitorearHabitat = scanner.nextInt();
                        switch (eleccionMonitorearHabitat) {
                            case 1:
                                // Monitorear un aviario
                                System.out.println("Ingresa la temperatura del aviario:");
                                float temperaturaAviarioAMonitorear = scanner.nextFloat();
                                System.out.println("Ingresa la humedad del aviario:");
                                float humedadAviarioAMonitorear = scanner.nextFloat();
                                System.out.println("Ingresa la limpieza del aviario (verdadero/falso):");
                                boolean limpiezaAviarioAMonitorear = scanner.nextBoolean();
                                ZOOLOGICO.HABITATS.ave aviarioAMonitorear = new ZOOLOGICO.HABITATS.ave(temperaturaAviarioAMonitorear, humedadAviarioAMonitorear, limpiezaAviarioAMonitorear);
                                aviarioAMonitorear.toString();
                                break;
                            case 2:
                                // Monitorear un acuario
                                System.out.println("Ingresa la temperatura del acuario:");
                                float temperaturaAcuarioAMonitorear = scanner.nextFloat();
                                System.out.println("Ingresa la salinidad del acuario:");
                                float salinidadAcuarioAMonitorear = scanner.nextFloat();
                                System.out.println("Ingresa la limpieza del acuario (verdadero/falso):");
                                boolean limpiezaAcuarioAMonitorear = scanner.nextBoolean();
                                acuaticos acuarioAMonitorear = new acuaticos(temperaturaAcuarioAMonitorear, salinidadAcuarioAMonitorear, limpiezaAcuarioAMonitorear);
                                acuarioAMonitorear.toString();
                                break;
                            case 3:
                                // Monitorear un terrario
                                System.out.println("Ingresa la temperatura del terrario:");
                                float temperaturaTerrarioAMonitorear = scanner.nextFloat();
                                System.out.println("Ingresa la humedad del terrario:");
                                float humedadTerrarioAMonitorear = scanner.nextFloat();
                                System.out.println("Ingresa la limpieza del terrario (verdadero/falso):");
                                boolean limpiezaTerrarioAMonitorear = scanner.nextBoolean();
                                terrestres terrarioAMonitorear = new terrestres(temperaturaTerrarioAMonitorear, humedadTerrarioAMonitorear, limpiezaTerrarioAMonitorear);
                                terrarioAMonitorear.toString();
                                break;
                            default:
                                System.out.println("Opción inválida.");
                        }
                        break;
                    case 2:
                        // Salir
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
                break;
            case 3:
                // Salir
                break;
            default:
                System.out.println("Opción inválida.");
        }

        // Opciones relacionadas con los visitantes
        System.out.println("1. Crear un recorrido");
        System.out.println("2. Visitar el zoológico");
        System.out.println("3. Salir");

        int eleccionVisitante = scanner.nextInt();
        switch (eleccionVisitante) {
            case 1:
                // Crear un recorrido
                System.out.println("1. Crear un recorrido de aves");
                System.out.println("2. Crear un recorrido de mamíferos");
                System.out.println("3. Crear un recorrido para niños");
                System.out.println("4. Salir");

                int eleccionCrearRecorrido = scanner.nextInt();
                switch (eleccionCrearRecorrido) {
                    case 1:
                        // Crear un recorrido de aves
                        TourAves recorridoAves = new TourAves();
                        System.out.println("Recorrido de aves creado: " + recorridoAves);
                        break;
                    case 2:
                        // Crear un recorrido de mamíferos
                        TourMamiferos recorridoMamiferos = new TourMamiferos();
                        System.out.println("Recorrido de mamíferos creado: " + recorridoMamiferos);
                        break;
                    case 3:
                        // Crear un recorrido para niños
                        TourNiños recorridoNiños = new TourNiños();
                        System.out.println("Recorrido para niños creado: " + recorridoNiños);
                        break;
                    case 4:
                        // Salir
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
                break;
            case 2:
                // Visitar el zoológico
                System.out.println("1. Seleccionar un recorrido");
                System.out.println("2. Visitar el zoológico sin recorrido");
                System.out.println("3. Salir");

                int eleccionVisitarZoo = scanner.nextInt();
                switch (eleccionVisitarZoo) {
                    case 1:
                        // Seleccionar un recorrido
                        System.out.println("1. Recorrido de aves");
                        System.out.println("2. Recorrido de mamíferos");
                        System.out.println("3. Recorrido para niños");
                        System.out.println("4. Salir");

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
                                System.out.println("Opción inválida.");
                        }
                        break;
                    case 2:
                        // Visitar el zoológico sin recorrido
                        System.out.println("Visitando el zoológico sin recorrido...");
                        break;
                    case 3:
                        // Salir
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
                break;
            case 3:
                // Salir
                break;
            default:
                System.out.println("Opción inválida.");
        }

        // Opciones relacionadas con el mantenimiento
        System.out.println("1. Agregar una tarea de mantenimiento");
        System.out.println("2. Mostrar tareas de mantenimiento");
        System.out.println("3. Salir");

        int eleccionMantenimiento = scanner.nextInt();
        switch (eleccionMantenimiento) {
            case 1:
                // Agregar una tarea de mantenimiento
                System.out.println("Ingresa la descripción de la tarea:");
                String descripcionTarea = scanner.next();
                System.out.println("Ingresa el tipo de tarea (regular/urgente):");
                String tipoTarea = scanner.next();
                GestorMantenimiento gestorMantenimiento = new GestorMantenimiento();
                TareaMantenimiento tareaMantenimiento = new TareaMantenimiento(descripcionTarea, tipoTarea);
                gestorMantenimiento.agregarTarea(tareaMantenimiento);
                System.out.println("Tarea de mantenimiento agregada: " + tareaMantenimiento);
                break;
            case 2:
                // Mostrar tareas de mantenimiento
                System.out.println("Tareas de mantenimiento:");
                GestorMantenimiento gestorMantenimientoMostrar = new GestorMantenimiento();
                gestorMantenimientoMostrar.mostrarTareasPendientes();
                break;
            case 3:
                // Salir
                break;
            default:
                System.out.println("Opción inválida.");
        }

        // Opciones relacionadas con los recursos
        System.out.println("1. Agregar un recurso");
        System.out.println("2. Mostrar recursos");
        System.out.println("3. Crear una orden de compra");
        System.out.println("4. Agregar un proveedor");
        System.out.println("5. Salir");

        int eleccionRecurso = scanner.nextInt();
        switch (eleccionRecurso) {
            case 1:
                // Agregar un recurso
                System.out.println("Ingresa el nombre del recurso:");
                String nombreRecurso = scanner.next();
                System.out.println("Ingresa la cantidad del recurso:");
                int cantidadRecurso = scanner.nextInt();
                AdministracionRecursos administracionRecursos = new AdministracionRecursos();
                Recurso recurso = new Recurso(nombreRecurso, cantidadRecurso);
                administracionRecursos.agregarRecurso(recurso);
                System.out.println("Recurso agregado: " + recurso);
                break;
            case 2:
                // Mostrar recursos
                System.out.println("Recursos:");
                AdministracionRecursos administracionRecursosMostrar = new AdministracionRecursos();
                administracionRecursosMostrar.mostrarInventario();
                break;
            case 3:
                // Crear una orden de compra
                System.out.println("Ingresa el nombre del recurso para ordenar:");
                String nombreRecursoParaOrdenar = scanner.next();
                System.out.println("Ingresa la cantidad del recurso para ordenar:");
                int cantidadRecursoParaOrdenar = scanner.nextInt();
                Pedido pedido = new Pedido();
                Recurso recursoParaOrdenar = new Recurso(nombreRecursoParaOrdenar, cantidadRecursoParaOrdenar);
                pedido.agregarItem(recursoParaOrdenar);
                System.out.println("Orden de compra creada: " + pedido);
                break;
            case 4:
                // Agregar un proveedor
                System.out.println("Ingresa el nombre del proveedor:");
                String nombreProveedor = scanner.next();
                System.out.println("Ingresa los recursos ofrecidos (separados por comas):");
                String recursosOfrecidos = scanner.next();
                String[] arrayRecursosOfrecidos = recursosOfrecidos.split(",");
                Proveedor proveedor = new Proveedor(nombreProveedor);
                for (String recursoOfrecido : arrayRecursosOfrecidos) {
                    proveedor.agregarRecursoOfrecido(recursoOfrecido.trim());
                }
                System.out.println("Proveedor agregado: " + proveedor);
                break;
            case 5:
                // Sal

                // Opciones relacionadas con la seguridad
                System.out.println("1. Agregar una cámara");
                System.out.println("2. Agregar un sensor de movimiento");
                System.out.println("3. Monitorear dispositivos de seguridad");
                System.out.println("4. Salir");

                int eleccionSeguridad = scanner.nextInt();
                switch (eleccionSeguridad) {
                    case 1:
                        // Agregar una cámara
                        System.out.println("Introduce la descripción de la cámara:");
                        String descripcionCamara = scanner.next();
                        Camara camara = new Camara(descripcionCamara);
                        System.out.println("Cámara agregada: " + camara);
                        break;
                    case 2:
                        // Agregar un sensor de movimiento
                        System.out.println("Introduce la descripción del sensor de movimiento:");
                        String descripcionSensor = scanner.next();
                        SensorMovimiento sensorMovimiento = new SensorMovimiento(descripcionSensor);
                        System.out.println("Sensor de movimiento agregado: " + sensorMovimiento);
                        break;
                    case 3:
                        // Monitorear dispositivos de seguridad
                        System.out.println("Monitoreando dispositivos de seguridad...");
                        // Lógica para monitorear dispositivos de seguridad
                        break;
                    case 4:
                        // Salir
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }

                scanner.close();
        }
    }
}

