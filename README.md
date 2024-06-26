このMavenプロジェクトはSonarQubeとNexusを利用するサンプルです。

プロジェクトをクリーンします。
```
mvn clean
```

Javaコードをコンパイルします。
```
mvn compile
```

Javaコードを実行します。
```
mvn exec:java
```

Javaコードをテストします。
```
mvn test
```

コードをパッケージ化し、プロジェクトのアーティファクトを生成します。
```
mvn package
```

アーティファクトをローカル・リポジトリに配置します。
```
mvn install
```

アーティファクトをリモート・リポジトリに配置します。
```
mvn deploy
```

SonarQubeで分析します。
```
mvn sonar:sonar
```
