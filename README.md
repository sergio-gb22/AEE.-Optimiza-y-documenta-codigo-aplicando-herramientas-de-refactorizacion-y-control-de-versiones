# AEE.-Optimiza-y-documenta-codigo-aplicando-herramientas-de-refactorizacion-y-control-de-versiones
Haciendo uso del repositorio creado por Willman Acosta (https://github.com/willeusa/RefactorizacionLegacy?authuser=0)
|                | # 1 |
|----------------|-----|
| **Agente:**    |   ChatGPT  |
| **Prompt:**    |    como puedo usar las clausulas de guarda en java sin codigo con ejemplo en psucodigo (no te explalles mucho) |
| **Respuesta textual:** | Las cláusulas de guarda sirven para detener una función temprano cuando una condición no se cumple.

La idea es:

validar primero los casos inválidos,
salir inmediatamente,
dejar la lógica principal al final.

Ejemplo en pseudocódigo:

funcion iniciarSesion(usuario)

    si usuario no existe
        salir
    fin si

    si contraseña es incorrecta
        salir
    fin si

    mostrar "Bienvenido"

fin funcion

Así evitas muchos bloques anidados y el flujo queda más claro. |
