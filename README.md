# 🎮 Proyecto Final Juego CRUD de Jugadores en Java

Este programa es una aplicación de escritorio desarrollada en **Java** utilizando **Swing (NetBeans GUI Builder)**. Permite gestionar una lista de jugadores mediante operaciones CRUD: Crear, Leer, Editar y Eliminar. Los datos se guardan automáticamente en un archivo de texto para mantener la información entre sesiones.

---

## 🧩 Funcionalidades

✅ **Agregar Jugador**
- Los campos requeridos son: Nombre, Nivel, Juego Favorito y Score.
- El ID se genera automáticamente.
- Se toma una captura de pantalla al momento de agregar.

✅ **Buscar Jugador**
- Si se ingresa un ID: se muestra el jugador correspondiente.
- Si el campo ID está vacío: se listan todos los jugadores.

✅ **Editar Jugador**
- Modifica la información de un jugador existente, basado en su ID.

✅ **Eliminar Jugador**
- Permite eliminar un jugador por su ID.
- Muestra una ventana de confirmación antes de eliminar.

✅ **Guardar en archivo**
- Todos los jugadores se guardan automáticamente en `jugador.txt` cada vez que se realiza un cambio.

---

## 🗃️ Estructura de Archivos

- `Jugador.java` → Clase que representa al jugador (modelo).
- `JugadorManager.java` → Controlador que maneja la lógica de negocio y almacenamiento.
- `frmGame.java` → Interfaz gráfica (ventana principal).
- `jugador.txt` → Archivo donde se guardan los datos.

---

## 🖥️ Requisitos

- Java JDK 8 o superior
- NetBeans IDE (recomendado para editar la GUI)
- Sistema operativo compatible con Java (Windows, macOS, Linux)

---

## 🚀 Cómo usar

1. Abre el proyecto en NetBeans o cualquier IDE Java.
2. Ejecuta `frmGame.java` como clase principal.
3. Usa la interfaz para agregar, buscar, editar o eliminar jugadores.
4. Los datos se guardan automáticamente en el archivo `jugador.txt`.

---

## 🧠 Notas Técnicas

- El ID es autogenerado y único.
- El archivo `jugador.txt` se sobrescribe completamente tras cada cambio.
- La interfaz se creó con NetBeans GUI Builder para facilitar el diseño visual.
- El archivo puede editarse manualmente, pero se recomienda hacerlo desde la aplicación.

---

## 👨‍💻 Autor

**Andres Felipe Mena Murillo** – Proyecto Final CRUD GUI con persistencia en archivo  
📧 Contacto: [amena@eafit.edu.co]

