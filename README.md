# このプロジェクトについて

このプロジェクトではSpring Boot と MySQLを使ったCRUD処理をもつ RESTful な Web API を作成します。

# 開発環境

- Java 17
- Spring Boot 3.3.0
- MySQL 8

# APIの概要

## 名前を全件取得するAPI

- リクエスト
    - Method: GET
    - URL: /names
- レスポンス
    - ステータスコード: 200
    - ボディ： 名前のリストを JSON 形式で返す

```curl
curl --location 'http://localhost:8080/names'
```
