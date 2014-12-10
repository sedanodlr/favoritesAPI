---
category: Favoritos
path: '/usuario/$uId<[0-9]*>/favorito'
title: 'Añadir favorito a usuario'
type: 'POST'

layout: nil
---

Este método se utiliza para añadir un favorito a un usuario existente

### Request

* El header debe ser **Content-type: application/json**.

* **El cuerpo no debe ir vacío** 

```Content-type: application/json```
```{
    'nombre': 'League of Legends',
    'url': 'euw.leagueoflegends.com',
    'tags':[
    {'tagName':'e-Sports'}
    ]
}```

### Response

**En caso de éxito**, devuelve:

```Status: 201 Created```


For errors responses, see the [response status codes documentation](#response-status-codes).
