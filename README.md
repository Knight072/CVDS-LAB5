# CVDS-LAB5
INTEGRANTES

    Daniel Felipe Rojas Hernández
  
    Esteban Valencia
  
RESPUESTAS
  - PARTE I 
    - Has un request GET a la URL https://www.escuelaing.edu.co/es/ y verifica el body de respuesta en las opciones Pretty, Raw, Preview.
      - Pretty
        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/b4407cef-3ff7-4ff7-bba5-7a6ad8b657ca)
      - Raw
        
        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/11f4fcf5-cbe1-4b84-8755-a8738e5789e3)
      - Preview
     
        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/2a60951b-5a28-4407-9964-ac3a54c59830)

    - Ahora has otro request GET al recurso https://dummyjson.com/todos, nuevamente verifica el body en varias opciones.
      - Pretty
   
          ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/06ff58e5-097b-4617-b914-5b54c5e81390)

      - Raw
     
          ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/dfe9e686-bc0c-4b23-b2a9-f1c0f04c3787)

      - Preview
    
          ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/484fe3b6-cd27-43aa-9be2-0ce0c97629a4)

    - ¿Qué pasa si no envío el método correcto?
   
        Podemos ver que al mandar el método delete, nos envía un documento html en el que se muestra error y que no es posible eliminar la página /todos
      - Pretty
   
        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/452e536e-9656-4758-b1d5-3c2899325dc5)

      - Preview
        
        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/ee2c0235-bccb-4f23-a876-85f665e8b93d)
 
    - ¿Qué pasa si al body response HTML lo fuerzo a leerse como JSON?

       Como es un documento html el que obtenemos postman no lo va a interpretar como un JSON, por lo que se ve en los colores de las líneas de código en las imágenes

      ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/c5bae92e-0be1-4ed8-97b7-1c9367497868)

      ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/add879d0-11f2-4552-9134-43666ca3b7b1)


    - ¿Por qué el preview de HTML no se ve igual a cuando accedo a la URL en un navegador web?

      Es debido a que solo obtenemos el HTML, y no la hoja de estilos de CSS, que su apariencia varia bastante  
    - ¿Qué pasa si le envías un body a una solicitud GET?

      En las peticiones de tipo GET no se debe enviar un parámetro body, pues el body solamente se debe dejar mandar cuando el tipo de petición es POST.
      
    Has los dos request anteriores pero ahora usando la herramienta Telnet sobre el puerto 80. Telnet soporta HTTP y no HTTPS, entonces ¿Qué significa la respuesta 301 cuándo usas           telnet en el puerto 80?.

    ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/90d4b5a7-a6f6-476c-ad4d-83ffc320b2dd)

    ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/8c6583cb-deca-41a5-815c-d979446b505f)

    ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/a42ff408-7134-4775-a7ac-bec3344be580)



    El código de estado 301 típicamente se usa cuando ocurre un cambio del sitio de HTTP a HTTPS. 
  
  - PARTE II
    
      ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/2cfd7132-e970-406b-aae6-131ee2e3211e)

      ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/28eca5b0-946b-48ba-8c14-40ce3c32148d)

      ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/cdd45248-a4ad-4795-b3b7-55ee4085f3e5)

      ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/29df98da-be65-4e26-853a-6f41140ab555)


      

    - ¿Qué hace cada uno de los archivos en la aplicación?
      - package.json
          - Contiene información sobre el proyecto así como metadatos funcionales (número de version, dependencias, etc.). Esta información es legible por el ser                                     humano. Su ubicación natural es en la raíz del proyecto. 
      - index.html
          - Es la página principal o de inicio de cualquier sitio web. Si alguno de estos archivos está presente en el directorio, el navegador cargará esa página de forma                           predeterminada o, de lo contrario, se mostrará un directorio (índice) de los archivos con enlaces. 
      - App.js
          - Maneja la lógica de los estados de la aplicación, si se presenta un error o si se borra el resultado de la operaciónn. 
      - KeyPadComponent.js
          - Se definen las acciones de cada uno de los botones de la calculadora, además, donde se específica el valor de cada botón. 
      - ResultComponent.js
          - Es el componente que se encarga de devolver el resultado de la operación. 
      - index.js
          - La clase que inicializa la lógica de la aplicación. 
      - styles.css
          - Aplica la parte visual de una página web, colores, tamaño de los componentes, entre otros. 
    - Después de haber visto los cambios, vuelve a abrir la URL original https://codesandbox.io/s/react-js-simple-calculator-pefmr y sigue los siguientes pasos:
      - Descargar código en un Zip
      - Descomprimir el Zip en la carpeta de proyectos de software, (en ciertos PC solo funciona 7-Zip)
   
        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/86f9bcf2-f080-496e-8a0b-b9db3503203a)

      - Abrir una terminal de Git Bash en la carpeta descomprimida
      - Instalar las dependencias con npm install

          ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/12c0d0ba-a44e-4201-812b-d53a9f71a0a4)

      - Iniciar la aplicación con npm start, en algunos computadores con versiones antiguas de nodejs hay que agregar NODE_OPTIONS=--openssl-legacy-provider npm run start
     
          ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/7d18b9ac-98ba-43e9-9631-5a5154cf9523)


         ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/ad2bd653-e463-4492-a100-9a5f7cc5ad36)


      - Abrir la ruta http://localhost:3000/ en un navegador web como Firefox o Google Chrome   

        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/b4a752d7-3cf9-445a-98bc-eb16b3102834)

        Ahora, has el request GET http://localhost:3000/ usando Postman, y revisa si el body de la respuesta es igual a alguno de los archivos del proyecto. Significa eso que es un              recurso web dinámico o estático?
     
        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/04ec79ad-378e-4412-a221-fbd294d6bbef)


        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/4d2e9360-e9b8-47d9-8609-b1a6855e6ba1)


        La respuesta es igual que el archivo index.html del proyecto, por lo que resulta ser un recurso web estático
        
  - PARTE III
      - ¿Por qué MVC obtiene ese nombre?
          - Modelo - Contains los datos de la aplicación. Puede ser un objeto o una colección de objetos.
          - Vista - Representa la información proveída por el controlador en un formato en particular.
          - Controlador - Contines la lógica de una aplicación.
         
      - ¿Cuáles son las ventajas de usar MVC?
          - Mapeo flexible: proporciona las anotaciones específicas que redirigen fácilmente la página.
          - Desarrollo rápido: Facilita el desarrollo rápido y paralelo.
          - Ligero: utiliza un contenedor de servlet liviano para desarrollar e implementar su aplicación.
          - Código reutilizable: en lugar de crear nuevos objetos, nos permite reutilizar los objetos existentes.
          - Funciones separadas: Spring MVC separa cada función, donde el objeto modelo, el controlador, el objeto de comando, la resolución de vista, DispatcherServlet, el validador,
            etc. pueden ser cumplidos por un objeto especializado.
      - ¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?
          - Se puede diferenciar de forma más clara donde se encuentran los controladores, los archivos html, los test, dado que las anotaciones permiten acceder más fácil y rápido a                estos recursos.
      - ¿Qué anotaciones usaste y cuál es la diferencia entre ellas?
          - @ComponentScan: permite correr los controladores que se encuentran en carpetas aparte del método con anotación @SpringBootApplication
          - @ResponseBody: indica que el tipo de resultado debe escribirse directamente en el cuerpo de la respuesta en cualquier formato que especifique, como JSON o XML.  

        Ahora, haz el request GET http://localhost:8080/greeting usando Postman, y revisa si el body de la respuesta es igual a alguno de los archivos del proyecto. Significa eso que es         un recurso web dinámico o estático?
   
        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/b1f3582c-5c2b-4e77-8b10-626f05846ab8)


        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/5f51cb85-7a39-4b15-ac15-bd5c992e9037)

        Es un recurso estático, dado que, al momento de acceder a la página siempre aparece el mismo mensaje sin importar quien ingrese a la página.

        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/b076108b-1907-4455-bc7a-0b110e09fb91)

        Pero, si se modifica su URL, pasándole un nombre cualquiera como parámetro, se puede modificar el mensaje por defecto.

- PARTE IV
    - ¿Qué es RESTful?
        - La API RESTful es una interfaz que dos sistemas de computación utilizan para intercambiar información de manera segura a través de Internet.  

