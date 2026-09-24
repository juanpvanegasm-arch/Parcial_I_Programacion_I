import java.time.LocalDate;
import java.util.Scanner;
public class Aplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Supermercado supermercado = new Supermercado("Market Plus", "Carrera 15 N 14-15, Barrio La Castellana", 31571412);
        int opcion;
        do{
            System.out.println("-------Menú Supermercado-------");

            System.out.println("-------Cliente-------");

            System.out.println("1. Ingresar cliente: ");
            System.out.println("2. Actualizar cliente");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Mostrar cliente");

            System.out.println("-------Producto-------");
            System.out.println("5. Ingresar producto: ");
            System.out.println("6. Actualizar producto");
            System.out.println("7. Eliminar producto");
            System.out.println("8. Mostrar producto");

            System.out.println("-------Compra-------");
            System.out.println("9. Ingresar compra: ");
            System.out.println("10. Actualizar compra");
            System.out.println("11. Eliminar compra");
            System.out.println("12. Mostrar compra");
            System.out.println("13. Mostrar valor total de la compra en una fecha determinada ");

            System.out.println("14. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("--------Ingresar cliente------");
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre1 = sc.nextLine();
                    System.out.print("Ingrese el documento: ");
                    int documento1 = sc.nextInt();
                    System.out.print("Ingrese el teléfono del cliente: ");
                    int telefono1= sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el correo electronico del cliente: ");
                    String correoElectronico1 = sc.nextLine();
                    Cliente cliente = new Cliente(nombre1, documento1, telefono1, correoElectronico1);
                    if(supermercado.ingresarCliente(cliente)){
                        System.out.println("Cliente agregado correctamente");
                    }
                    else{
                        System.out.println("No se ha podido registrar el cliente. El cliente ya existe. ");
                    }
                    break;
                case 2:
                    System.out.println("--------Actualizar cliente------");
                    System.out.print("Ingrese el documento del cliente: ");
                    int documento2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Ingrese el teléfono del cliente: ");
                    int nuevoTelefono= sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el correo electronico del cliente: ");
                    String correoElectronico2 = sc.nextLine();
                    Cliente clienteActualizado = new Cliente(nuevoNombre,  documento2, nuevoTelefono, correoElectronico2);
                    if (supermercado.actualizarCliente(documento2, clienteActualizado)){
                        System.out.println("Cliente actualizado correctamente. ");
                    }else{
                        System.out.println("El cliente no existe. ");
                    }
                    break;
                case 3:
                    System.out.println("------Eliminar cliente-----");
                    System.out.print("Ingrese el documento del cliente a eliminar: ");
                    int documentoEliminar = sc.nextInt();
                    if (supermercado.eliminarCliente(documentoEliminar)){

                        System.out.println("El cliente ha sido eliminado correctamente. ");
                    }
                    else {
                        System.out.println("El cliente no existe. ");
                    }
                    break;
                case 4:
                    System.out.println("------Mostrar clientes-----");
                    for(Cliente listaClientes : supermercado.getListaClientes()){
                        System.out.print(listaClientes + "\n");
                    }
                    break;
                case 5:
                    System.out.println("--------Ingresar producto------");
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = sc.nextLine();
                    System.out.print("Ingrese el codigo del producto: ");
                    int codigoProducto = sc.nextInt();
                    System.out.print("Ingrese el precio del producto: ");
                    double precioUnitario = sc.nextDouble();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidadProducto = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese la categoría del producto (ALIMENTOS, BEBIDAS, PRODUCTOS_DE_ASEO, CUIDADO_PERSONAL): ");
                    CategoriaProducto categoriaProducto = CategoriaProducto.valueOf(sc.nextLine());
                    Producto producto = new Producto(nombreProducto, codigoProducto, precioUnitario, cantidadProducto, categoriaProducto);
                    if(supermercado.ingresarProducto(producto)){

                        System.out.println("Producto agregado correctamente. ");
                    }
                    else{
                        System.out.println("El producto no ha sido agregado ya que esta repetido. ");
                    }
                    break;
                case 6:
                    System.out.println("--------Actualizar producto------");

                    System.out.print("Ingrese el codigo del producto: ");
                    int codigoProductoActualizado = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el nuevo nombre del producto: ");
                    String nombreProductoActualizado = sc.nextLine();
                    System.out.print("Ingrese el nuevo precio del producto: ");
                    double precioUnitarioActualizado = sc.nextDouble();
                    System.out.print("Ingrese la nueva cantidad del producto: ");
                    int cantidadProductoActualizado = sc.nextInt();
                    System.out.print("Ingrese la nueva categoría del producto (ALIMENTOS, BEBIDAS, PRODUCTOS_DE_ASEO, CUIDADO_PERSONAL): ");
                    CategoriaProducto categoriaProductoActualizado = CategoriaProducto.valueOf(sc.nextLine());

                    Producto productoActualizado  = new Producto(nombreProductoActualizado, codigoProductoActualizado, precioUnitarioActualizado, cantidadProductoActualizado, categoriaProductoActualizado);

                    if (supermercado.actualizarProducto(codigoProductoActualizado, productoActualizado)){
                        System.out.println("Producto actualizado correctamente. ");
                    }else{
                        System.out.println("El producto no existe. ");
                    }
                    break;
                case 7:
                    System.out.println("------Eliminar producto-----");
                    System.out.print("Ingrese el codigo del producto a eliminar: ");
                    int codigoEliminar = sc.nextInt();
                    if (supermercado.eliminarProducto(codigoEliminar)){
                        System.out.println("El producto ha sido eliminado correctamente. ");
                    }
                    else {
                        System.out.println("El producto no existe. ");
                    }
                    break;
                case 8:
                    System.out.println("------Mostrar productos-----");
                    for(Producto productos : supermercado.getListaProductos()){
                        System.out.print(productos + "\n");
                    }
                    break;
                case 9:
                    System.out.println("--------Ingresar compra------");
                    System.out.print("Ingrese el documento del cliente: ");
                    int documentoCliente = sc.nextInt();
                    sc.nextLine();
                    if(!supermercado.verificarCliente(documentoCliente)){
                        System.out.print("El cliente no está registrado, registrese primero. ");
                        break;
                    }
                    System.out.println("Ingrese el codigo de la compra: ");
                    int codigoCompra = sc.nextInt();
                    System.out.println("Ingrese la fecha (AAAA-MM-DD): ");
                    LocalDate fechaCompra = LocalDate.parse(sc.next());
                    System.out.println("Ingrese el metodo de pago(TARJETA, TRANSFERENCIA, EFECTIVO): ");
                    MetodoPago metodoPagoCompra = MetodoPago.valueOf(sc.next());
                    Compra nuevaCompra = new Compra(codigoCompra,fechaCompra,metodoPagoCompra);
                    boolean agregandoProductos = true;
                    while (agregandoProductos) {
                        System.out.println("\n --- Productos Disponibles ---  ");
                        for (Producto productos : supermercado.getListaProductos()) {
                            System.out.println("Codigo: " + productos.getCodigo() +
                                    ", Nombre: " + productos.getNombre() +
                                    ", Precio: " + productos.getPrecioUnitario() +
                                    ", Stock: " + productos.getCantidadDisponible());
                        }
                        System.out.print("\n Ingrese el código del producto a comprar (O aprete -1 para finalizar) ");
                        int codigoProductoIngresado = sc.nextInt();
                        if (codigoProductoIngresado == -1) {
                            agregandoProductos = false;
                            break;
                        }
                        Producto productoEncontrado = null;
                        for (Producto productos : supermercado.getListaProductos()) {
                            if (productos.getCodigo() == codigoProductoIngresado) {
                                productoEncontrado = productos;
                                break;
                            }
                        }
                        if (productoEncontrado == null) {
                            System.out.print("El producto no existe. ");
                            continue;
                        }
                        System.out.println("Ingrese la cantidad que quiere comprar: ");
                        int cantidadPedida = sc.nextInt();
                        if (cantidadPedida > productoEncontrado.getCantidadDisponible()) {
                            System.out.print("Stock insuficiente. Cantidad disponible: " + productoEncontrado.getCantidadDisponible());
                        } else {
                           supermercado.restarCantidadDeProductos(cantidadPedida, productoEncontrado);
                            Producto productoComprado = new Producto(
                                    productoEncontrado.getNombre(),
                                    productoEncontrado.getCodigo(),
                                    productoEncontrado.getPrecioUnitario(), cantidadPedida,
                                    productoEncontrado.getCategoriaProductos()
                            );
                            nuevaCompra.getListaProductos().add(productoComprado);
                            System.out.println("Producto agregado exitosamente a la compra.");
                        }
                    }
                    supermercado.ingresarCompra(nuevaCompra);
                    System.out.print("Compra realizada exitosamente. El valor total de la compra es: $" + nuevaCompra.calcularValorTotal()+"\n");
                    break;
                case 10:
                    System.out.println("--------Actualizar compra------");
                    System.out.print("Ingrese el codigo de compra de la compra: ");
                    int codigoCompraActualizado = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Se actualizaran los siguientes datos: Fecha de realización y método de pago.");
                    System.out.println("Ingrese la fecha (AAAA-MM-DD): ");
                    LocalDate fechaCompraActualizada = LocalDate.parse(sc.next());
                    System.out.print("Ingrese el metodo de pago(TARJETA, TRANSFERENCIA, EFECTIVO): ");
                    MetodoPago metodoPagoCompraActualizado = MetodoPago.valueOf(sc.next());
                    Compra compraActualizada = new Compra(codigoCompraActualizado, fechaCompraActualizada, metodoPagoCompraActualizado);
                    if (supermercado.actualizarCompra(codigoCompraActualizado, compraActualizada)) {
                        System.out.println("Datos de compra actualizados correctamente. \n");
                    }else{
                        System.out.println("La compra no existe. \nEl código no coincide con alguna compra registrada.\n");
                    }
                    break;
                case 11:
                    System.out.println("------Eliminar compra-----");
                    System.out.print("Ingrese el codigo de la compra a eliminar: ");
                    int codigoAEliminar = sc.nextInt();
                    if (supermercado.eliminarCompra(codigoAEliminar)) {
                        System.out.println("La compra ha sido eliminada correctamente. \n");
                    }
                    else {
                        System.out.println("La compra no existe. \n");
                    }
                    break;
                case 12:
                    System.out.println("-----Mostrar compra-----");
                    for(Compra compras : supermercado.getListaCompras()) {
                        System.out.print(compras + "\n");
                    }
                    break;
                case 13:
                    System.out.println("------Mostrar valor total de la compra en una fecha determinada-----");
                    System.out.print("Ingrese la fecha (AAAA-MM-DD): ");
                    LocalDate fecha = LocalDate.parse(sc.next());
                    System.out.print("El valor total de la compra es : $" + supermercado.calcularValorTotalEnFechaDeterminada(fecha) + "\n");
                    break;
                default:
                    System.out.print("Opción inválida.\nIntentelo de nuevo.\n");
                    break;
            }
        }while(opcion!=14);
    }
}