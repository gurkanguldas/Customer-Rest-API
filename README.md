
## Customer Rest API

The project aims to transfer customer information to the database in a healthy way. All customers can be searched or a single customer can be searched, deleted or added. At the same time, sorting, pagination and filtering can be done while searching for all customers. All requests are available in the postman collection file. When sending a request, the first login must be made and the token must be received.

#### These are the libraries used in the project.

* Spring Web
* Spring Data JPA
* MySql Connector
* Open API
* Model Mapper
* Lombok
* Spring Actuator
* Spring Security
* JSON Web Token

## SQL Tables

Three sql tables, customer, customer_contact and customer_information were used in the project. The customer table is in a one-to-one connection with customer_contact and customer_information.

```SQL
CREATE TABLE customer (
  customer_id bigint NOT NULL AUTO_INCREMENT,
  nickname varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  PRIMARY KEY (customer_id),
  UNIQUE KEY UK_lcu9u62qdnv7kviesuhdgpnmv (nickname)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE customer_contact (
  customer_contact_id bigint NOT NULL AUTO_INCREMENT,
  adress varchar(255) NOT NULL,
  city varchar(255) NOT NULL,
  country varchar(255) NOT NULL,
  disrict varchar(255) NOT NULL,
  phone_number bigint NOT NULL,
  PRIMARY KEY (customer_contact_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE customer_information (
  customer_information_id bigint NOT NULL AUTO_INCREMENT,
  date_of_birth date NOT NULL,
  gender varchar(255) NOT NULL,
  identification_number bigint NOT NULL,
  name varchar(255) NOT NULL,
  surname varchar(255) NOT NULL,
  PRIMARY KEY (customer_information_id),
  UNIQUE KEY UK_6hfkwf6ldbf78tnebdkq3xduj (identification_number)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```
You can find the sql script file [here](https://github.com/gurkanguldas/Customer-Rest-API/blob/main/Customer.sql). The contact and address information in the file is simulated. It does not reflect reality.

## JSON Web Token For Spring
#### Generate Token
![](https://user-images.githubusercontent.com/59657939/177346206-59bb3b69-60f0-4ac4-b821-8be183bbf85c.svg)
#### Validate Token
![](https://user-images.githubusercontent.com/59657939/177349858-380d5054-33ca-4787-984c-f4666b1649a1.svg)
## Customer API Endpoints
#### 1. To Call All Customers
```
GET /customer/rest/api/getcustomers
```


<table>
  <tr style="background-color:#f0f0ff">
    <th><sub>Name</sub></th>
    <th><sub>Type</sub></th>
    <th><sub>Mandatory</sub></th>
    <th><sub>Default Value</sub></th>
    <th><sub>Other Values</sub></th>
  </tr>
  <tr>
    <td><sub>sortType</sub></td>
    <td><sub>String</sub></td>
    <td><sub>false</sub></td>
    <td><sub>id</sub></td>
    <td>
    <sub>
        nickname, customerInfo.name, customerInfo.surname, customerInfo.gender, <br />customerInfo.dateOfBirth,
        customerInfo.identificationNumber,<br /> customerContact.country,
        customerContact.city, customerContact.disrict,<br />
        customerContact.adress, customerContact.phoneNumber
    </sub>
    </td>
  </tr>
  <tr style="background-color:#f0f0ff">
    <td><sub>descending</sub></td>
    <td><sub>boolean</sub></td>
    <td><sub>false</sub></td>
    <td><sub>false</sub></td>
    <td><sub>true, false</sub></td>
  </tr>
  <tr>
    <td><sub>pageSize</sub></td>
    <td><sub>int</sub></td>
    <td><sub>false</sub></td>
    <td><sub>10</sub></td>
    <td><sub>5, 10, 25, 50, 100 ...</sub></td>
  </tr>
  <tr style="background-color:#f0f0ff">
    <td><sub>pageNo</sub></td>
    <td><sub>int</sub></td>
    <td><sub>false</sub></td>
    <td><sub>0</sub></td>
    <td><sub>0 - ∞</sub></td>
  </tr>
  <tr>
    <td><sub>quary</sub></td>
    <td><sub>String</sub></td>
    <td><sub>false</sub></td>
    <td><sub>greater_than_or_equal</sub></td>
    <td><sub>between, like, in, equals, not_equals,<br> greater_than_or_equal, less_than_or_equal</sub></td>
  </tr>
  <tr style="background-color:#f0f0ff">
    <td><sub>table</sub></td>
    <td><sub>String</sub></td>
    <td><sub>false</sub></td>
    <td><sub>customer</sub></td>
    <td><sub>customer, customer_information, customer_contact</sub></td>
  </tr>
  <tr>
    <td><sub>column</sub></td>
    <td><sub>String</sub></td>
    <td><sub>false</sub></td>
    <td><sub>id</sub></td>
    <td><sub>id, nickname, name, surname, gender, dateOfBirth,<br>
        identificationNumber, country,city, disrict,adress, phoneNumber
        </sub></td>
  </tr>
  <tr style="background-color:#f0f0ff">
    <td><sub>value1</sub></td>
    <td><sub>Object</sub></td>
    <td><sub>false</sub></td>
    <td><sub>0</sub></td>
    <td><sub>Everything</sub></td>
  </tr>
  <tr>
    <td><sub>value2</sub></td>
    <td><sub>Object</sub></td>
    <td><sub>false</sub></td>
    <td><sub>0</sub></td>
    <td><sub>Everything</sub></td>
  </tr>
</table>

***
```
GET /customer/rest/api/getcustomers
```

<details>
  <summary>
    Result Endpoint
  </summary>
  
```json
{
  "succesful": true,
  "code": "getCustomers",
  "message": "The customer list has been successfully called up.",
  "result": [
    {
      "id": 1,
      "nickname": "yagizaybar65",
      "password": "IsrF16eJ7amxIc2",
      "customerInfo": {
        "id": 1,
        "name": "Yağız Erkân",
        "surname": "Aybar",
        "gender": "man",
        "dateOfBirth": "1970-09-17",
        "identificationNumber": 20781401532
      },
      "customerContact": {
        "id": 1,
        "country": "Turkey",
        "city": "GİRESUN",
        "disrict": "BULANCAK",
        "adress": "AHMETLİ KÖYÜ MAH.MERKEZ MEVKİ SOKAK NO:19 93072 BULANCAK/GİRESUN",
        "phoneNumber": 905456974246
      }
    },
    {
      "id": 2,
      "nickname": "celâleddindaglaroglu20",
      "password": "nBy8n5HCqq7",
      "customerInfo": {
        "id": 2,
        "name": "Celâleddin Asil",
        "surname": "Dağlaroğlu",
        "gender": "man",
        "dateOfBirth": "1989-08-01",
        "identificationNumber": 27255242181
      },
      "customerContact": {
        "id": 2,
        "country": "Turkey",
        "city": "TEKİRDAĞ",
        "disrict": "ÇERKEZKÖY",
        "adress": "GAZİ MUSTAFA KEMALPAŞA MAH.ŞEKER SOKAK NO:717 110896 ÇERKEZKÖY/TEKİRDAĞ",
        "phoneNumber": 905442480200
      }
    },
    {
      "id": 3,
      "nickname": "seybangonultas17",
      "password": "9la33LwmbX",
      "customerInfo": {
        "id": 3,
        "name": "Şeyban Altan",
        "surname": "Gönültaş",
        "gender": "man",
        "dateOfBirth": "1967-11-28",
        "identificationNumber": 17523295028
      },
      "customerContact": {
        "id": 3,
        "country": "Turkey",
        "city": "KONYA",
        "disrict": "SELÇUKLU",
        "adress": "BÜYÜKKAYACIK MAH.ORMANSEVEN SOKAK NO:816 100632 SELÇUKLU/KONYA",
        "phoneNumber": 905421818316
      }
    },
    {
      "id": 4,
      "nickname": "nihataybar42",
      "password": "G39gWvNCQARu",
      "customerInfo": {
        "id": 4,
        "name": "Nihat Cihad",
        "surname": "Aybar",
        "gender": "man",
        "dateOfBirth": "2006-01-21",
        "identificationNumber": 10328328145
      },
      "customerContact": {
        "id": 4,
        "country": "Turkey",
        "city": "MERSİN",
        "disrict": "AKDENİZ",
        "adress": "KARACAİLYAS MAH.2971. SOKAK NO:363 119645 AKDENİZ/MERSİN",
        "phoneNumber": 905456612249
      }
    },
    {
      "id": 5,
      "nickname": "ensarakisik53",
      "password": "sW56afU3F0aCT5N",
      "customerInfo": {
        "id": 5,
        "name": "Ensar Agâh",
        "surname": "Akışık",
        "gender": "man",
        "dateOfBirth": "1997-06-17",
        "identificationNumber": 18390353664
      },
      "customerContact": {
        "id": 5,
        "country": "Turkey",
        "city": "İSTANBUL",
        "disrict": "ADALAR",
        "adress": "KINALIADA MAH.MANASTIRALTI KÜME EVLERİ SOKAK NO:211 95630 ADALAR/İSTANBUL",
        "phoneNumber": 905471484248
      }
    },
    {
      "id": 6,
      "nickname": "samiyildizoglu60",
      "password": "PV4ai8rmI72g8cgJ",
      "customerInfo": {
        "id": 6,
        "name": "Sami Ercan",
        "surname": "Yıldızoğlu",
        "gender": "man",
        "dateOfBirth": "1949-01-16",
        "identificationNumber": 13958337237
      },
      "customerContact": {
        "id": 6,
        "country": "Turkey",
        "city": "İSTANBUL",
        "disrict": "ÜMRANİYE",
        "adress": "ÇAKMAK MAH.MEKAN SOKAK NO:683 96252 ÜMRANİYE/İSTANBUL",
        "phoneNumber": 905453959833
      }
    },
    {
      "id": 7,
      "nickname": "hayalipektemek43",
      "password": "4E2Hsy8rdHx",
      "customerInfo": {
        "id": 7,
        "name": "Hayali Gürkan",
        "surname": "Pektemek",
        "gender": "man",
        "dateOfBirth": "1944-04-07",
        "identificationNumber": 10676447910
      },
      "customerContact": {
        "id": 7,
        "country": "Turkey",
        "city": "İSTANBUL",
        "disrict": "ARNAVUTKÖY",
        "adress": "ANADOLU MAH.GELİBOLU CADDESİ SOKAK NO:560 119236 ARNAVUTKÖY/İSTANBUL",
        "phoneNumber": 905434302266
      }
    },
    {
      "id": 8,
      "nickname": "atalaykocoglu2",
      "password": "8cEqf55s46",
      "customerInfo": {
        "id": 8,
        "name": "Atalay Türkeş",
        "surname": "Koçoğlu",
        "gender": "man",
        "dateOfBirth": "2000-06-23",
        "identificationNumber": 22994273077
      },
      "customerContact": {
        "id": 8,
        "country": "Turkey",
        "city": "İSTANBUL",
        "disrict": "EYÜP",
        "adress": "GÜZELTEPE MAH.YENİ DUVAR SOKAK NO:542 95830 EYÜP/İSTANBUL",
        "phoneNumber": 905371975315
      }
    },
    {
      "id": 9,
      "nickname": "vehbibarbarosoglu7",
      "password": "6lL4m60uc",
      "customerInfo": {
        "id": 9,
        "name": "Vehbi Şihab",
        "surname": "Barbarosoğlu",
        "gender": "man",
        "dateOfBirth": "2008-01-10",
        "identificationNumber": 13604908183
      },
      "customerContact": {
        "id": 9,
        "country": "Turkey",
        "city": "ADANA",
        "disrict": "YÜREĞİR",
        "adress": "ULUBATLI HASAN MAH.3051. SOKAK NO:501 78213 YÜREĞİR/ADANA",
        "phoneNumber": 905364701754
      }
    },
    {
      "id": 10,
      "nickname": "tumerhamzaoglu51",
      "password": "4vv5Xc5jKLRt34H8v",
      "customerInfo": {
        "id": 10,
        "name": "Tümer Özden",
        "surname": "Hamzaoğlu",
        "gender": "man",
        "dateOfBirth": "1957-05-02",
        "identificationNumber": 24087597079
      },
      "customerContact": {
        "id": 10,
        "country": "Turkey",
        "city": "HATAY",
        "disrict": "İSKENDERUN",
        "adress": "NARDÜZÜ-NESLİ MAH.186. SOKAK NO:837 94364 İSKENDERUN/HATAY",
        "phoneNumber": 905515456072
      }
    }
  ]
}
```

</details>

***

######

```
GET /customer/rest/api/getcustomers?type=nickname&descending=true&size=5
```

<details>
  <summary>
    Result Endpoint
  </summary>
  
```json
{
  "succesful": true,
  "code": "getCustomers",
  "message": "The customer list has been successfully called up.",
  "result": [
    {
      "id": 326,
      "nickname": "zumrutpektemek25",
      "password": "Q2yjs77rQ",
      "customerInfo": {
        "id": 326,
        "name": "Zümrüt Berçin",
        "surname": "Pektemek",
        "gender": "woman",
        "dateOfBirth": "1941-07-27",
        "identificationNumber": 17677987263
      },
      "customerContact": {
        "id": 326,
        "country": "Turkey",
        "city": "KASTAMONU",
        "disrict": "DADAY",
        "adress": "KAYABAĞI KÖYÜ MAH.KARŞI MEVKİ SOKAK NO:335 98318 DADAY/KASTAMONU",
        "phoneNumber": 905458633366
      }
    },
    {
      "id": 498,
      "nickname": "zumrutakbulut2",
      "password": "T15J53hOVi3470u",
      "customerInfo": {
        "id": 498,
        "name": "Zümrüt",
        "surname": "Akbulut",
        "gender": "woman",
        "dateOfBirth": "1965-08-19",
        "identificationNumber": 24645342730
      },
      "customerContact": {
        "id": 498,
        "country": "Turkey",
        "city": "TEKİRDAĞ",
        "disrict": "ÇORLU",
        "adress": "AHİMEHMET KÖYÜ MAH.13. SOKAK NO:185 110944 ÇORLU/TEKİRDAĞ",
        "phoneNumber": 905361588334
      }
    },
    {
      "id": 442,
      "nickname": "zuleyhaerberk53",
      "password": "HQiGMu2X",
      "customerInfo": {
        "id": 442,
        "name": "Züleyha",
        "surname": "Erberk",
        "gender": "woman",
        "dateOfBirth": "1997-05-27",
        "identificationNumber": 21197941850
      },
      "customerContact": {
        "id": 442,
        "country": "Turkey",
        "city": "BALIKESİR",
        "disrict": "BALYA",
        "adress": "ENVERPAŞA MAH.NALBANT ABDULLAH KANDEMİR SOKAK NO:211 83675 BALYA/BALIKESİR",
        "phoneNumber": 905447875840
      }
    },
    {
      "id": 451,
      "nickname": "zulalbarbarosoglu73",
      "password": "THMUftrA0",
      "customerInfo": {
        "id": 451,
        "name": "Zülal",
        "surname": "Barbarosoğlu",
        "gender": "woman",
        "dateOfBirth": "2006-06-01",
        "identificationNumber": 27927916459
      },
      "customerContact": {
        "id": 451,
        "country": "Turkey",
        "city": "İSTANBUL",
        "disrict": "GAZİOSMANPAŞA",
        "adress": "HÜRRİYET MAH.315. SOKAK NO:696 95968 GAZİOSMANPAŞA/İSTANBUL",
        "phoneNumber": 905356944120
      }
    },
    {
      "id": 372,
      "nickname": "zubeydekarabocek78",
      "password": "4pSr48itf042",
      "customerInfo": {
        "id": 372,
        "name": "Zübeyde",
        "surname": "Karaböcek",
        "gender": "woman",
        "dateOfBirth": "1979-03-12",
        "identificationNumber": 28881181045
      },
      "customerContact": {
        "id": 372,
        "country": "Turkey",
        "city": "AFYONKARAHİSAR",
        "disrict": "HOCALAR",
        "adress": "YEŞİLHİSAR-CUMHURİYET MAH.CİHAN SOKAK NO:161 79640 HOCALAR/AFYONKARAHİSAR",
        "phoneNumber": 905348544803
      }
    }
  ]
}
```

</details>

***

######

```
GET /customer/rest/api/getcustomers?type=nickname&size=5&page=2&quary=equals&table=customer_contact&column=city&start_value=ANKARA
```

<details>
  <summary>
    Result Endpoint
  </summary>
  
```json
{
  "succesful": true,
  "code": "getCustomers",
  "message": "The customer list has been successfully called up.",
  "result": [
    {
      "id": 478,
      "nickname": "julidecetin71",
      "password": "Y848cHGSKBOBMdJ",
      "customerInfo": {
        "id": 478,
        "name": "Julide",
        "surname": "Çetin",
        "gender": "woman",
        "dateOfBirth": "1996-02-01",
        "identificationNumber": 26516876938
      },
      "customerContact": {
        "id": 478,
        "country": "Turkey",
        "city": "ANKARA",
        "disrict": "ÇANKAYA",
        "adress": "ÜNİVERSİTELER MAH.1614. SOKAK NO:288 80988 ÇANKAYA/ANKARA",
        "phoneNumber": 905391239034
      }
    },
    {
      "id": 463,
      "nickname": "julideozkok9",
      "password": "EQuVtT7wD9oIUOW",
      "customerInfo": {
        "id": 463,
        "name": "Julide",
        "surname": "Özkök",
        "gender": "woman",
        "dateOfBirth": "2003-09-28",
        "identificationNumber": 23265857397
      },
      "customerContact": {
        "id": 463,
        "country": "Turkey",
        "city": "ANKARA",
        "disrict": "ETİMESGUT",
        "adress": "GÜZELKENT MAH.720. SOKAK NO:362 125556 ETİMESGUT/ANKARA",
        "phoneNumber": 905442818001
      }
    },
    {
      "id": 144,
      "nickname": "kadirsozeri56",
      "password": "Sx2WbXKU6",
      "customerInfo": {
        "id": 144,
        "name": "Kadir ",
        "surname": "Sözeri",
        "gender": "man",
        "dateOfBirth": "1969-06-10",
        "identificationNumber": 27229413142
      },
      "customerContact": {
        "id": 144,
        "country": "Turkey",
        "city": "ANKARA",
        "disrict": "KEÇİÖREN",
        "adress": "ESERTEPE MAH.303. SOKAK NO:50 81084 KEÇİÖREN/ANKARA",
        "phoneNumber": 905498780620
      }
    },
    {
      "id": 455,
      "nickname": "nazanbasoglu78",
      "password": "l7HpO3y0V",
      "customerInfo": {
        "id": 455,
        "name": "Nazan",
        "surname": "Başoğlu",
        "gender": "woman",
        "dateOfBirth": "1975-04-20",
        "identificationNumber": 28895114221
      },
      "customerContact": {
        "id": 455,
        "country": "Turkey",
        "city": "ANKARA",
        "disrict": "ALTINDAĞ",
        "adress": "ALEMDAĞ MAH.1042/1 SOKAK NO:799 80827 ALTINDAĞ/ANKARA",
        "phoneNumber": 905377225829
      }
    },
    {
      "id": 170,
      "nickname": "necibbademci36",
      "password": "y3CUlL5BfXeRIBOW",
      "customerInfo": {
        "id": 170,
        "name": "Necib ",
        "surname": "Bademci",
        "gender": "man",
        "dateOfBirth": "1958-09-17",
        "identificationNumber": 11746434403
      },
      "customerContact": {
        "id": 170,
        "country": "Turkey",
        "city": "ANKARA",
        "disrict": "KIZILCAHAMAM",
        "adress": "GÜNEYSARAY KÖYÜ MAH.KÖYÜN KENDİSİ SOKAK NO:895 123962 KIZILCAHAMAM/ANKARA",
        "phoneNumber": 905387578561
      }
    }
  ]
}
```

</details>

***

######

#### 2. To Call Customers By ID

```
GET /customer/rest/api/getcustomer
```

<table>
  <tr style="background-color:#f0f0ff">
    <th><sub>Name</sub></th>
    <th><sub>Type</sub></th>
    <th><sub>Mandatory</sub></th>
    <th><sub>Values</sub></th>
  </tr>
  <tr>
    <td><sub>id</sub></td>
    <td><sub>Long</sub></td>
    <td><sub>true</sub></td>
    <td><sub>1 - ∞</sub></td>
  </tr>
  
</table>

######

***

```
GET /customer/rest/api/getcustomer?id=25
```

<details>
  <summary>
    Result Endpoint
  </summary>
  
```json
{
  "succesful": true,
  "code": "getCustomerById",
  "message": "Customer ID 25 was successfully returned.",
  "result": {
    "id": 25,
    "nickname": "ertugrulakyuz50",
    "password": "YhM4QF86H",
    "customerInfo": {
      "id": 25,
      "name": "Ertuğrul Ali",
      "surname": "Akyüz",
      "gender": "man",
      "dateOfBirth": "1997-04-11",
      "identificationNumber": 13736613104
    },
    "customerContact": {
      "id": 25,
      "country": "Turkey",
      "city": "ERZURUM",
      "disrict": "YAKUTİYE",
      "adress": "ÖMER NASUHİ BİLMEN MAH.FERAH SOKAK NO:883 119134 YAKUTİYE/ERZURUM",
      "phoneNumber": 905422950976
    }
  }
}
```

</details>

***
######

#### 3. To Add Customer

```
POST /customer/rest/api/addcustomer
```

<details>
  <summary>
    Customer Structure
  </summary>
  
```json
{
  "id": 0,
  "nickname": "string",
  "password": "string",
  "customerInfo": {
    "id": 0,
    "name": "string",
    "surname": "string",
    "gender": "string",
    "dateOfBirth": "yyyy-mm-dd",
    "identificationNumber": 0
  },
  "customerContact": {
    "id": 0,
    "country": "string",
    "city": "string",
    "disrict": "string",
    "adress": "string",
    "phoneNumber": 0
  }
}
```

</details>

<details>
  <summary>
    Result Endpoint
  </summary>
  
```json
{
  "succesful": true,
  "code": "addCustomer",
  "message": "Customer registration successful.",
  "result": {
    "id": 0,
    "nickname": "gurkanguldas12",
    "password": "$2a$10$lDMe7/ENhpnVkW28XCLKHeAG7KU5v9HddqiZYLH4JOWGc2gzIe66G",
    "customerInfo": {
      "id": 0,
      "name": "Bekir Gurkan",
      "surname": "Guldas",
      "gender": "man",
      "dateOfBirth": "1998-06-27",
      "identificationNumber": 12345678904
    },
    "customerContact": {
      "id": 0,
      "country": "Turkey",
      "city": "Istanbul",
      "disrict": "Pendik",
      "adress": "Batı Mah.",
      "phoneNumber": 905455454545
    }
  }
}
```

</details>

######

######

#### 4. To Delete Customers By ID

```
DELETE /customer/rest/api/deletecustomer
```

<table>
  <tr style="background-color:#f0f0ff">
    <th><sub>Name</sub></th>
    <th><sub>Type</sub></th>
    <th><sub>Mandatory</sub></th>
    <th><sub>Values</sub></th>
  </tr>
  <tr>
    <td><sub>id</sub></td>
    <td><sub>Long</sub></td>
    <td><sub>true</sub></td>
    <td><sub>1 - ∞</sub></td>
  </tr>
  
</table>

######

***

```
DELETE /customer/rest/api/deletecustomer?id=20
```

<details>
  <summary>
    Result Endpoint
  </summary>
  
```json
{
  "succesful": true,
  "code": "deleteCustomerById",
  "message": "The customer with ID number 20 was deleted.",
  "result": {
    "id": 20,
    "nickname": "hurkansozeri71",
    "password": "044x1Yt0eoQ",
    "customerInfo": {
      "id": 20,
      "name": "Hürkan İhvan",
      "surname": "Sözeri",
      "gender": "man",
      "dateOfBirth": "1993-07-05",
      "identificationNumber": 21831255161
    },
    "customerContact": {
      "id": 20,
      "country": "Turkey",
      "city": "MANİSA",
      "disrict": "AHMETLİ",
      "adress": "GÖKKAYA-SÜLEYMAN SUAT MAH.ASMALI SOKAK NO:447 103100 AHMETLİ/MANİSA",
      "phoneNumber": 905387346569
    }
  }
}
```

</details>

***

## Swagger API

![](https://user-images.githubusercontent.com/59657939/177358747-4fce6c75-76dd-4138-a9e8-0bf46354ed22.gif)