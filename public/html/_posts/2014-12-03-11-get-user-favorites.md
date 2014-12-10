---
category: Favoritos
path: '/user/$uId<[0-9]*>/telefonos'
title: 'Obtener favoritos de un usuario'
type: 'GET'

layout: nil
---

Método que devuelve los favoritos del usuario solicitado

### Response

Los favoritos del usuario solicitado

```Status: 200 OK```

```[
  {
    'id': 33,
    'nombre': 'El Mundo',
    'url': 'www.elmundo.es',
    'tags': [
      {
        'id': 33,
        'tagName': 'noticias'
      },
      {
        'id': 34,
        'tagName': 'españa'
      }
    ]
  },
  {
    'id': 34,
    'nombre': 'realmadrid',
    'url': 'www.realmadrid.es',
    'tags': []
  },
  {
    'id': 35,
    'nombre': 'barça',
    'url': 'www.fcbarcelona.es',
    'tags': []
  }
]```



Para ver información sobre los códigos de error, visite [documentación sobre los códigos de error](#response-status-codes).