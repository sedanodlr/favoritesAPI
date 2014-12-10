---
category: Favoritos
path: '/usuario/$uId<[0-9]*>/favorito/$fId<[0-9]*>'
title: 'Eliminar favorito de usuario'
type: 'DELETE'

layout: nil
---

Este método elimina el favorito cuyo ID se ha proporcionado

### Request

* **`$fId<[0-9]*`** es el ID del favorito a eliminar.


* **`$uId<[0-9]*`** es el ID del usuario al que pertenece.

* **El cuerpo se ignora**.

### Response

**En caso de éxito**, devuelve:

```Status: 200 Deleted```

For errors responses, see the [response status codes documentation](#response-status-codes).