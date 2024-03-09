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
      - Pretty
   
        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/452e536e-9656-4758-b1d5-3c2899325dc5)

      - Preview
        
        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/ee2c0235-bccb-4f23-a876-85f665e8b93d)
 
    - ¿Qué pasa si al body response HTML lo fuerzo a leerse como JSON?

      ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/c5bae92e-0be1-4ed8-97b7-1c9367497868)

      ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/add879d0-11f2-4552-9134-43666ca3b7b1)


    - ¿Por qué el preview de HTML no se ve igual a cuando accedo a la URL en un navegador web?
    - ¿Qué pasa si le envías un body a una solicitud GET?

    Has los dos request anteriores pero ahora usando la herramienta Telnet sobre el puerto 80. Telnet soporta HTTP y no HTTPS, entonces ¿Qué significa la respuesta 301 cuándo usas telnet     en el puerto 80?.
  
  - PARTE II
    
      ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/2cfd7132-e970-406b-aae6-131ee2e3211e)

      ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/28eca5b0-946b-48ba-8c14-40ce3c32148d)

      ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/cdd45248-a4ad-4795-b3b7-55ee4085f3e5)

      ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/29df98da-be65-4e26-853a-6f41140ab555)


      

    - ¿Qué hace cada uno de los archivos en la aplicación?
      - package.json
      - index.html
      - App.js
      - KeyPadComponent.js
      - ResultComponent.js
      - index.js
      - styles.css
    - Después de haber visto los cambios, vuelve a abrir la URL original https://codesandbox.io/s/react-js-simple-calculator-pefmr y sigue los siguientes pasos:
      - Descargar código en un Zip
      - Descomprimir el Zip en la carpeta de proyectos de software, (en ciertos PC solo funciona 7-Zip)
   
        ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/86f9bcf2-f080-496e-8a0b-b9db3503203a)

      - Abrir una terminal de Git Bash en la carpeta descomprimida
      - Instalar las dependencias con npm install

          ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/12c0d0ba-a44e-4201-812b-d53a9f71a0a4)

      - Iniciar la aplicación con npm start, en algunos computadores con versiones antiguas de nodejs hay que agregar NODE_OPTIONS=--openssl-legacy-provider npm run start

         ![image](https://github.com/Knight072/CVDS-LAB5/assets/116401447/8f5f2c8b-872d-43cf-a5a1-f82c541fa725)

      - Abrir la ruta http://localhost:3000/ en un navegador web como Firefox o Google Chrome   
    
    
  - PARTE III
    ¿Por qué MVC obtiene ese nombre? (puede apoyarse de https://www.javatpoint.com/spring-mvc-tutorial)
    ¿Cuáles son las ventajas de usar MVC?
    ¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?
    ¿Qué anotaciones usaste y cuál es la diferencia entre ellas?
Ahora, haz el request GET http://localhost:8080/greeting usando Postman, y revisa si el body de la respuesta es igual a alguno de los archivos del proyecto. Significa eso que es un recurso web dinámico o estático?
