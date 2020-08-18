<!-- Generator: Widdershins v4.0.1 -->

<h1 id="mastertech">Mastertech v1.0</h1>


# Introdução
API para o sistema de acessos

# Overview
Sistema de testes criado no curso da Mastertech

Base URLs:

* <a href="http://localhost:8080">http://localhost:8080</a>

* <a href="http://localhost:8081">http://localhost:8081</a>

* <a href="http://localhost:8082">http://localhost:8082</a>

<h1 id="mastertech-sistema-de-acesso-misc">Misc</h1>

## Get Door Not Exists

<a id="opIdGetDoorNotExists"></a>

> Code samples

```http
GET http://localhost:8080/porta/1 HTTP/1.1
Host: localhost:8080

```

`GET /porta/1`

Obtém uma porta pelo id informado. Deve retornar que a porta não existe.

<h3 id="get-door-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Door Wrong Validation

<a id="opIdGetDoorWrongValidation"></a>

> Code samples

```http
GET http://localhost:8080/porta/X HTTP/1.1
Host: localhost:8080

```

`GET /porta/X`

Obtém uma porta pelo id informado. Deve retornar que não possui o formato correto.

<h3 id="get-door-wrong-validation-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Door

<a id="opIdPostDoor"></a>

> Code samples

```http
POST http://localhost:8080/porta HTTP/1.1
Host: localhost:8080
Content-Type: application/json

```

`POST /porta`

Adiciona uma nova porta.

> Body parameter

```json
{
  "andar": "11",
  "sala": "11B35"
}
```

<h3 id="post-door-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PostDoorRequest](#schemapostdoorrequest)|true|none|

<h3 id="post-door-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Customer Not Exists

<a id="opIdGetCustomerNotExists"></a>

> Code samples

```http
GET http://localhost:8080/cliente/1 HTTP/1.1
Host: localhost:8080

```

`GET /cliente/1`

Obtém um cliente pelo id. Deve retornar que o cliente não existe.

<h3 id="get-customer-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Customer

<a id="opIdPostCustomer"></a>

> Code samples

```http
POST http://localhost:8080/cliente HTTP/1.1
Host: localhost:8080
Content-Type: application/json

```

`POST /cliente`

Adiciona um novo cliente.

> Body parameter

```json
{
  "id": 1,
  "nome": "Nicollas Gabriel"
}
```

<h3 id="post-customer-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PostCustomerRequest](#schemapostcustomerrequest)|true|none|

<h3 id="post-customer-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Access Customer Not Exists

<a id="opIdGetAccessCustomerNotExists"></a>

> Code samples

```http
GET http://localhost:8080/acesso/333/1 HTTP/1.1
Host: localhost:8080

```

`GET /acesso/333/1`

Obtém um acesso pelo id do cliente e da porta. Deve retornar que o cliente não existe.

<h3 id="get-access-customer-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Access Door Not Exists

<a id="opIdGetAccessDoorNotExists"></a>

> Code samples

```http
GET http://localhost:8080/acesso/1/333 HTTP/1.1
Host: localhost:8080

```

`GET /acesso/1/333`

Obtém um acesso pelo id do cliente e da porta. Deve retornar que a porta não existe.

<h3 id="get-access-door-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Access Not Exists

<a id="opIdGetAccessNotExists"></a>

> Code samples

```http
GET http://localhost:8080/acesso/1/1 HTTP/1.1
Host: localhost:8080

```

`GET /acesso/1/1`

Obtém um acesso pelo id do cliente e da porta. Deve retornar que o acesso não existe.

<h3 id="get-access-not-exists-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Delete Access

<a id="opIdDeleteAccess"></a>

> Code samples

```http
DELETE http://localhost:8080/acesso/1/1 HTTP/1.1
Host: localhost:8080

```

`DELETE /acesso/1/1`

Deleta um acesso pelo id do cliente e o id da porta.

<h3 id="delete-access-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get Access Wrong Validations

<a id="opIdGetAccessWrongValidations"></a>

> Code samples

```http
GET http://localhost:8080/acesso/0/0 HTTP/1.1
Host: localhost:8080

```

`GET /acesso/0/0`

Obtém um acesso pelo id do cliente e da porta. Deve retornar os dois erros de validação, pelo campo de cliente e pelo campo da porta.

<h3 id="get-access-wrong-validations-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Access

<a id="opIdPostAccess"></a>

> Code samples

```http
POST http://localhost:8080/acesso HTTP/1.1
Host: localhost:8080
Content-Type: application/json

```

`POST /acesso`

Cria um novo acesso à uma porta para um cliente.

> Body parameter

```json
{
  "porta_id": 1,
  "cliente_id": 1
}
```

<h3 id="post-access-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PostAccessRequest](#schemapostaccessrequest)|true|none|

<h3 id="post-access-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

# Schemas

<h2 id="tocS_PostDoorRequest">PostDoorRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostdoorrequest"></a>
<a id="schema_PostDoorRequest"></a>
<a id="tocSpostdoorrequest"></a>
<a id="tocspostdoorrequest"></a>

```json
{
  "andar": "11",
  "sala": "11B35"
}

```

PostDoorRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|andar|string|true|none|none|
|sala|string|true|none|none|

<h2 id="tocS_PostCustomerRequest">PostCustomerRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostcustomerrequest"></a>
<a id="schema_PostCustomerRequest"></a>
<a id="tocSpostcustomerrequest"></a>
<a id="tocspostcustomerrequest"></a>

```json
{
  "id": 1,
  "nome": "Nicollas Gabriel"
}

```

PostCustomerRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|id|integer(int32)|true|none|none|
|nome|string|true|none|none|

<h2 id="tocS_PostAccessRequest">PostAccessRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostaccessrequest"></a>
<a id="schema_PostAccessRequest"></a>
<a id="tocSpostaccessrequest"></a>
<a id="tocspostaccessrequest"></a>

```json
{
  "porta_id": 1,
  "cliente_id": 1
}

```

PostAccessRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|porta_id|integer(int32)|true|none|none|
|cliente_id|integer(int32)|true|none|none|

