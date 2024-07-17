# Proyecto: API para Lista de Tareas con Login y Notificaciones

Desarrollé una API para gestionar las ventas y el stock de productos de un bazar que ha experimentado un notable aumento en sus ventas. 
Esta API permite realizar operaciones de CRUD (Crear, Leer, Actualizar, Eliminar) tanto para productos como para clientes y ventas. 
Además, proporciona funcionalidades adicionales para mejorar la eficiencia operativa del bazar, como la obtención de productos con stock bajo, 
la lista de productos de una venta específica y la sumatoria del monto y cantidad total de ventas de un día determinado.

## Características principales:

- Permite autenticar usuarios con JWT.
- Permite realizar un CRUD completo de Usuarios mediante endpoints HTTP.
- Permite realizar un CRUD completo de Tareas según su nivel de prioridad, todas ellas heredando de una clase abstracta general que facilita el polimorfismo en responses.
- Implementa patrones DTO (Objeto de Transferencia de Datos) para una comunicación eficiente entre el frontend y el backend.
- Ofrece endpoints adicionales para obtener información específica, como filtros que traigan las tareas sin realizar o pendientes en determinado rango calendario u horario.
- Recordatorios de tareas por medio de notifiaciones hacia el mail registrado del usuario, ofreciendo además un mensaje de incentivo patrocinado por el cliente.
- Alertas de procrastinación.

## Tecnologías utilizadas:

<div align="center">
	<table>
		<tr>
            <td><img width="50" src="https://user-images.githubusercontent.com/25181517/117201156-9a724800-adec-11eb-9a9d-3cd0f67da4bc.png" alt="Java" title="Java"/></td>
			<td><img width="50" src="https://user-images.githubusercontent.com/25181517/183891303-41f257f8-6b3d-487c-aa56-c497b880d0fb.png" alt="Spring Boot" title="Spring Boot"/></td>
      <td><img width="50" src="https://raw.githubusercontent.com/No-Country/c17-61-t-java.old/Produccion/extra/postman-icon.webp" alt="Spring Security" title="Spring Security"/></td>
      <td><img width="50" src="https://user-images.githubusercontent.com/25181517/192107858-fe19f043-c502-4009-8c47-476fc89718ad.png" alt="REST" title="REST"/></td>
      <td><img width="50" src="https://user-images.githubusercontent.com/25181517/183896128-ec99105a-ec1a-4d85-b08b-1aa1620b2046.png" alt="MySQL" title="MySQL"/></td>
			<td><img width="50" src="https://user-images.githubusercontent.com/25181517/117207493-49665200-adf4-11eb-808e-a9c0fcc2a0a0.png" alt="Hibernate" title="Hibernate"/></td>
      <td><img width="50" src="https://raw.githubusercontent.com/No-Country/c17-61-t-java.old/Produccion/extra/postman-icon.webp" alt="Postman" title="Postman"/></td>
			<td><img width="50" src="https://raw.githubusercontent.com/No-Country/c17-61-t-java.old/Produccion/extra/postman-icon.webp" alt="Maven" title="Maven"/></td>
			<td><img width="50" src="https://raw.githubusercontent.com/No-Country/c17-61-t-java.old/Produccion/extra/postman-icon.webp" alt="JSON" title="JSON"/></td>
		</tr>
	</table>
</div>
