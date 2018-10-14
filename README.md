# CalculadoraPacoCS
Proyecto calculadora usando el modelo vista contralor.
Lo que que debe hacer el proyecto es: al introducir a través de dos inputs un valor numérico, haga la operación que deseemos y nos muestre el mensaje de dicha operación. En caso de que se divida entre 0, debe salir el error correspondiente. Si intentamos acceder directamente al controlador, también deberá salir un mensaje de error, este error lo controlaremos en el método doGet. 

*Commit 11/10/2018 He creado la organización de los ficheros y carpetas. Están creadas todas las clases necesarias. Me falta la programación para que funcione el programa.

*Commit 12/10/2018 He añadido al método doGet el error correspondiente (error al no pasar por el formulario incial de la calculadora). También he modificado el index, añadiendo la imagen lateral con un include.

*Commit 13/10/2018 Las operaciones de sumar, restar y multiplicar funcionan perfectamente. El error de ir directamente al controlador (servlet) está hecho y funciona. Falta el error de dividir entre 0 y que funcione la operación.

*Commit 14/10/2018 (mediodía) Falta el error de dividir entre 0.

*Commit 14/10/2018 a las 23:28 horas. Sigue faltando el error de dividir entre 0. Se han hecho cambios en la forma de mostrar el resultado, en los commits anteriores  aparecía el resultado sin sacar los datos de la operación, es decir, sin escribir los operandos y el signo de la operación, ahora sale el mensaje "El resultado de 3 + 2 es:".


*Commit 14/10/2018 a las 23:42 horas. Ya sale el error de dividir entre 0, pero no es tratado con la excepción correspondiente, si con la excepción ArithmeticException.
