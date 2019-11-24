# Pokédex Android

O objetivo principal deste projeto é consumir a [PokéApi](https://pokeapi.co/). em uma aplicação android nativa, mapeando os JSON’s retornados pela API para classes Java, utilizando a biblioteca [GSON](https://github.com/google/gson).
Otimizar as requisições HTTP com o [Retrofit](https://square.github.io/retrofit/).
Para carregar imagens no RecyclerView vamos utilizar a biblioteca [Picasso](https://square.github.io/picasso/).

## PokéApi

Este site fornece uma interface API RESTful para objetos altamente detalhados criados a partir de milhares de linhas de dados relacionadas ao Pokémon .

[https://pokeapi.co/](https://pokeapi.co/)

## Gson

Gson é uma biblioteca Java que pode ser usada para converter objetos Java em suas representações JSON. Também pode ser usado para converter uma sequência JSON em um objeto Java equivalente.

[https://github.com/google/gson](https://github.com/google/gson)

## Retrofit

A Retrofit é uma API desenvolvida pela Square seguindo padrão REST, fornecendo um padrão simples de implementação para transmissão de dados entre aplicação e servidor, que faz uso do JSON.

[https://square.github.io/retrofit/](https://square.github.io/retrofit/).

## Picasso

O Android Picasso é uma poderosa biblioteca de download e cache de imagens. As imagens adicionam contexto e talento visual necessários aos aplicativos Android. O Picasso permite o carregamento de imagens sem problemas no seu aplicativo - geralmente em uma linha de código.

[https://square.github.io/picasso/](https://square.github.io/picasso/)

## Dependências

Para utilizar as bibliotecas mencionadas, você precisará alterar o build.gradle do Projeto.

```
dependencies {
    implementation 'com.google.code.gson:gson:2.8.5'
    implementation 'com.squareup.retrofit2:retrofit:2.4.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.4.0'
    implementation 'com.squareup.picasso:picasso:2.5.2'
}
```
## APK

[Pokédex](https://drive.google.com/open?id=1mMw0zfBDtuM9ptltFPrLjF5zp3dfli-s)
