# このMavenプロジェクトはSonarQubeとNexusを利用するサンプルです。

### プロジェクトをクリーンします。
```
mvn clean
```

### Javaコードをコンパイルします。
```
mvn compile
```

### Javaコードを実行します。
```
mvn exec:java
```

### Javaコードをテストします。
```
mvn test
```

### コードをパッケージ化し、プロジェクトのアーティファクトを生成します。
```
mvn package
```

### アーティファクトをローカル・リポジトリに配置します。
```
mvn install
```

### アーティファクトをリモート・リポジトリに配置します。
```
mvn deploy
```
※デプロイ先はローカル設置のNexus　http://localhost:8081

### SonarQubeで分析します。
```
mvn sonar:sonar -D sonar.token=<このプロジェクトのトークン>
```
