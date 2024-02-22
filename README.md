
# Review Service

Пользователь может:
1. Писать новый отзыв;
2. Редактировать отзыв;
3. Видеть историю своих отзывов.



## Deployment

В директории resources -> db есть Dockerfile для поднятия базы локально. Также есть файл со скриптом, необходимо их исполнить.

Запустите следующую команду для сборки образа:
```bash
  docker build -t my-postgres .
```
Это создаст образ с тегом "my-postgres" на основе Dockerfile в текущем каталоге.

Запустите контейнер, используя созданный образ:
```bash
  docker run -d -p 5432:5432 my-postgres
```


## Appendix

Ссылка на сваггер:
http://localhost:8080/reviews/swagger-ui/index.html#/

