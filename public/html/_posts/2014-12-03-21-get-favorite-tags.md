---
category: Tags
path: '/favorito/$favoritoId<[0-9]*>/tags'
title: 'Obtener tags de un favorito'
type: 'GET'

layout: nil
---

Método que devuelve los tags de un favorito

### Response

La lista de tags de un favorito

```Status: 200 OK```
```{
    {
        'id': 1,
        'tagName':'e-Sports'
    },
    {
        'id': 2,
        'tagName':'Noticias'
    }
}```

Para ver información sobre los códigos de error, visite [documentación sobre los códigos de error](#response-status-codes).