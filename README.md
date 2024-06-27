# El Buen Sabor

Una aplicación de E-commerce para empresas y sectores varios.

## Autores

- Alejandro Lencinas: [@raullencinas-frm-utn](https://github.com/raullencinas-frm-utn)
- Elias Santilli: [@santillielias](https://github.com/santillielias)
- Leandro Valdearenas: [@LeandroValdearenas](https://github.com/LeandroValdearenas)

## Variables de Entorno

Para correr este proyecto, se requiere configurar las siguientes variables de entorno en el backend:

```
	AUTH0_AUDIENCE=http://elbuensabordashboard.api/;AUTH0_CLIENT_ID=6rNLtJDiwnvetOImay3b3zhOsiLgO50N;AUTH0_ISSUER_URI=https://dev-tpbpxmhe53uahzfg.us.auth0.com/;AUTH0_SECRET_CLIENT=wfJ_pzfFUljvxXM8RThd5FCd41zR2C57l-3OPfsOSLizkzwvIOQKp4UeUHBlgLJ2;CORS_ALLOWED_ORIGINS=http://localhost:5173,http://localhost:5174;FACTURACION_EMAIL=elbuensabor.facturacion@gmail.com;FACTURACION_EMAIL_PASSWORD=comy sgph xali vmqj;FRONT_CLIENTE_URL=http://localhost:5174;MP_ACCESS_TOKEN=TEST-4974850526435297-060410-9db2a3b03da2f71d0da971a6788ce807-1826259069;SPRING_SECURITY_LOG_LEVEL=INFO;WEB_SECURITY_DEBUG=true
```

## Credenciales de Prueba

- SUPERADMIN: superadmin@elbuensabor.com : `DefaultPassword123!`
- ADMIN: juancitoadmin@elbuensabor.com : `DefaultPassword123!`
- CAJERO: juancitocajeres@elbuensabor.com : `DefaultPassword123!`
- CLIENTE: alex@elbuensabor.com : `pepito123A`
- COCINERO: pepitococinas@elbuensabor.com : `DefaultPassword123!`
- DELIVERY: jorgedeliveres@elbuensabor.com : `DefaultPassword123!`

## Despliegue

Para desplegar el proyecto, sigue los siguientes pasos:

1) **Desplegar el servicio de imágenes:** En la carpeta `ImagenesBack` se encuentra el servicio de imágenes, el cual se utiliza para almacenar imágenes en una base de datos separada y consumida como servicio. 
   Para desplegarlo, recarga el proyecto de Gradle para que se instalen las dependencias. 
   Posteriormente, compila el proyecto y ejecuta el archivo `ImagenesMicroservicioApplication.java`.

2) **Desplegar el servicio del backend:** En la carpeta `BuenSaborBack` se encuentra el servicio del backend. 
   Para desplegarlo, recarga el proyecto de Gradle para que se instalen las dependencias. 
   Posteriormente, configura las variables de entorno. 
   Finalmente, compila el proyecto y ejecuta el archivo `BuenSaborBackApplication.java`.

3) **Desplegar el frontend del dashboard:** En la carpeta `BuenSaborDashboard`, ejecuta los siguientes comandos:
```bash
  npm install
  npm run dev
```
Luego, mediante un navegador, dirígete a la ruta http://localhost:5173.

4) **Desplegar el frontend del E-commerce:** En la carpeta BuenSaborCliente, ejecuta los siguientes comandos:
```bash
  npm install
  npm run dev
```
Luego, mediante un navegador, dirígete a la ruta http://localhost:5174.

5) **¡Disfruta!**
