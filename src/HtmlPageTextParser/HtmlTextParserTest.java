package HtmlPageTextParser;

import HtmlPageTextParser.ConstStrs.Addresses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class HtmlTextParserTest {

    @Test
    void allTextGoogle() {
        HtmlTextParser page = new HtmlTextParser(Addresses.googleAddress);
        Assertions.assertDoesNotThrow((Executable) page::allText);
        Assertions.assertNotNull(page.allText());
        Assertions.assertNotEquals(page.allText(),
                "");
    }

    @Test
    void allTextSteam() {
        HtmlTextParser page = new HtmlTextParser(Addresses.steamAddress);
        Assertions.assertDoesNotThrow((Executable) page::allText);
        Assertions.assertNotNull(page.allText());
        Assertions.assertNotEquals(page.allText(),"");
    }

    @Test
    void wordsSteam() {
        HtmlTextParser page = new HtmlTextParser(Addresses.steamAddress);
        Assertions.assertDoesNotThrow((Executable) page::words);
        Assertions.assertNotNull(page.words());
        Assertions.assertNotEquals(page.words(),new String[]{""});
    }

    @Test
    void wordsGfg() {
        HtmlTextParser page = new HtmlTextParser(Addresses.gfgAddress);
        Assertions.assertDoesNotThrow((Executable) page::words);
        Assertions.assertNotNull(page.words());
        Assertions.assertNotEquals(page.words(),"");
    }

    @Test
    void inOneCopyWordsSimbirSoft() {
        HtmlTextParser page = new HtmlTextParser(Addresses.simbirSoftAddress);
        String[] oneCopyWords;
        oneCopyWords = ("""
                Разработка
                программного
                обеспечения
                на
                заказ
                SimbirSoft
                С
                2001
                года
                IT
                company
                that
                cares
                Решения
                Для
                банков
                страховых
                Оценка
                проектов
                Data
                Science
                Автоматизация
                бизнеса
                ShopChat
                Food
                Tech
                медицинской
                сферы
                промышленности
                Услуги
                продукт
                под
                ключ
                Аутсорсинг
                Модернизация
                ПО
                Спасти
                Обеспечение
                качества
                QA
                консалтинг
                Техническая
                поддержка
                по
                SLA
                Jira
                Service
                архитектура
                UX
                аудит
                Внедрение
                Битрикс
                24
                Портфолио
                Технологии
                Отрасли
                О
                нас
                компании
                Награды
                Клиенты
                и
                отзывы
                Наши
                процессы
                Новости
                Менеджмент
                Контакты
                Социальная
                ответственность
                Карьера
                Работа
                Вакансии
                Начало
                карьеры
                Блог
                Напишите
                нам
                8
                800
                200
                9924
                Ок
                Наш
                сайт
                использует
                файлы
                cookie
                Оставаясь
                www
                simbirsoft
                com
                вы
                подтверждаете
                свое
                согласие
                использование
                данных
                файлов
                для
                роста
                Вашего
                Лидеры
                в
                разработке
                современных
                решений
                компания
                мы
                занимаемся
                профессиональной
                разработкой
                софта
                специалисты
                оказывают
                услуги
                созданию
                качественного
                продукта
                отвечающего
                всем
                требованиям
                Чем
                можем
                помочь
                Разработать
                Быстро
                разберёмся
                вашей
                задаче
                предоставим
                результат
                минимальные
                сроки
                Организуем
                цикл
                разработки
                тестирования
                внедрения
                сопровождения
                системы
                Обеспечить
                надежную
                работу
                ваших
                систем
                Выявим
                уязвимости
                проверим
                нагрузку
                работоспособность
                протестируем
                юзабилити
                Ваш
                приложение
                другое
                принесут
                максимальную
                выгоду
                Оказать
                аутсорсинга
                Оперативно
                сформируем
                подключим
                команды
                аналитике
                тестированию
                дизайну
                Спроектируем
                архитектуру
                проведём
                интеграцию
                окажем
                техническую
                поддержку
                production
                Восстановим
                систему
                после
                неудачной
                выпустим
                релиз
                организуем
                процесс
                стабильного
                развития
                Почему
                с
                нами
                выгодно
                Выстраиваем
                там
                где
                их
                нет
                подстраиваемся
                они
                есть
                получаете
                нужное
                решение
                а
                заботимся
                о
                технических
                деталях
                проекта
                Технологическая
                экспертиза
                решения
                комплексных
                задач
                приобретаете
                единого
                партнера
                потребностей
                со
                скоростью
                вашего
                достигаете
                бизнес
                цели
                ожидаемый
                срок
                Первый
                первый
                месяц
                работ
                оперативно
                видите
                отдачу
                вложения
                100
                релизов
                выполнено
                четкий
                всех
                этапах
                предсказуемые
                Сокращаем
                time
                to
                market
                преимущество
                скорости
                выхода
                доверяют
                Посмотреть
                все
                фраз
                Оперативная
                реакция
                наши
                пожелания
                просто
                полагались
                опыт
                получили
                блестящие
                результаты
                Свернут
                горы
                чтобы
                удовлетворить
                высокие
                требования
                Очень
                гибкий
                подход
                к
                решению
                Моментально
                реагируют
                любые
                запросы
                Искренне
                хотят
                сделать
                максимум
                Предлагают
                альтернативные
                варианты
                реализации
                учетом
                сроков
                бюджета
                Показали
                очень
                высокий
                уровень
                Спасли
                наш
                проект
                которым
                не
                справилась
                другая
                команда
                довольны
                вкладом
                успех
                человеческими
                отношениями
                Всегда
                готовы
                предоставить
                профессиональную
                команду
                Проявляют
                инициативность
                создании
                Создали
                комфортные
                условия
                партнерских
                отношений
                задачи
                какими
                бы
                сложными
                ни
                были
                выполняются
                качественно
                Прозрачный
                дает
                возможность
                всегда
                быть
                курсе
                хода
                подходом
                СимбирСофт
                анализу
                контролю
                управлению
                Внесли
                ясность
                те
                которые
                сами
                себе
                представляли
                Собранность
                выполнение
                короткие
                корректное
                приятное
                общение
                Компетентные
                ответственные
                доброжелательные
                профессионалы
                выполняют
                самом
                высоком
                уровне
                впечатлили
                этапы
                аналитики
                подготовки
                прототипов
                дизайна
                предлагают
                креативные
                инновационные
                подходы
                сложных
                погрузились
                показали
                отличный
                внес
                свой
                вклад
                общий
                нашего
                сотрудничества
                получаем
                хорошую
                инвестиций
                от
                этого
                Соблюдены
                обязательства
                срокам
                качеству
                работы
                Предлагали
                пути
                улучшения
                логики
                приложения
                увеличения
                производительности
                Превзошли
                ожидания
                выполнили
                даже
                больше
                запланированного
                работала
                быстро
                что
                позволило
                уложиться
                обещанные
                обсуждать
                смену
                приоритетов
                действий
                разбивку
                Буквально
                через
                несколько
                месяцев
                первые
                прекрасно
                понимали
                какой
                ожидать
                окончанию
                этапа
                полностью
                оправдали
                включились
                освоив
                незнакомую
                технологическую
                платформу
                опирались
                преданность
                делу
                Предельно
                адаптировали
                участников
                нашим
                буквально
                прочитали
                мысли
                предоставили
                прототип
                самого
                высокого
                Нацелены
                долгосрочную
                увидели
                качественные
                первой
                недели
                адаптер
                был
                готов
                недель
                заключения
                договора
                ежедневная
                вовлеченность
                дала
                понять
                выбрали
                отличного
                реально
                работающий
                за
                разумные
                деньги
                слышат
                чего
                хочет
                клиент
                уверенностью
                смотрим
                будущее
                ходе
                максимально
                учитывались
                заказчика
                поставленные
                выполнены
                Дают
                четкое
                понимание
                того
                креативно
                мыслят
                достичь
                целей
                клиента
                наилучшим
                образом
                ценим
                интересные
                идеи
                сервиса
                Высокая
                организованность
                процессов
                ведения
                Темп
                точно
                соответствовал
                ожиданиям
                оценкам
                делают
                возможное
                Благодаря
                им
                разработали
                6
                крупных
                продуктов
                подключили
                необходимых
                специалистов
                Хорошо
                сработанная
                высоким
                потенциалом
                взаимовыгодному
                сотрудничеству
                два
                месяца
                начала
                первая
                версия
                была
                готова
                Адаптировались
                потребности
                агентства
                наличии
                собственных
                сертифицированных
                экспертов
                рассчитывать
                дополнительных
                течение
                нескольких
                часов
                Предоставляют
                становятся
                частью
                нашей
                мобильных
                приложений
                интернета
                вещей
                демонстрационные
                вовремя
                работающим
                функционалом
                Реализовали
                мобильное
                точности
                так
                как
                я
                планировал
                готовый
                отвечающий
                доволен
                теми
                продуктами
                результате
                Качество
                демонстрация
                прототипа
                превзошли
                Заботятся
                потребностях
                целях
                находят
                творческие
                нетривиальные
                Проактивность
                приятно
                удивляет
                исключительно
                успешным
                успешно
                завершили
                десятки
                сотрудничая
                ними
                Удалось
                вникнуть
                необходимую
                предметную
                область
                эффективно
                решили
                знаю
                более
                клиентоориентированной
                обеспечению
                понравилось
                сотрудничать
                Вся
                необходимая
                информация
                поступала
                Ориентируют
                соответствии
                тенденциями
                мирового
                рынка
                компоненты
                флагманского
                сотрудничеством
                сфере
                мобильной
                Еженедельно
                выделенный
                менеджер
                демонстрировал
                текущую
                версию
                Достойный
                партнер
                ответственных
                менеджментом
                можно
                найти
                язык
                Укладываются
                сжатые
                Подходят
                выполнению
                душой
                Взяли
                себя
                ведущую
                роль
                уже
                найдут
                способ
                разработать
                лучший
                условиях
                стресса
                Ответственная
                профессиональная
                Способны
                решать
                широкого
                технологического
                спектра
                Уделяют
                внимание
                деталям
                пользователи
                остались
                приложением
                графическом
                интерфейсе
                реализуются
                самые
                смелые
                гораздо
                быстрее
                срока
                Высоко
                квалифицированная
                помощью
                прошли
                инвестиционный
                раунд
                выиграли
                грант
                Сколково
                Уверенное
                владение
                английским
                языком
                видели
                контролировали
                весь
                Читать
                награды
                Подробнее
                знаете
                начать
                Дайджест
                сентября
                практикума
                до
                дней
                открытых
                дверей
                07
                09
                2021
                Вошли
                топ
                быстрорастущих
                ИКТ
                компаний
                проведет
                Осенний
                онлайн
                интенсив
                23
                08
                новости
                разрабатывает
                уникальные
                программные
                из
                России
                США
                стран
                Европы
                email
                protected
                проспект
                Нариманова
                дом
                1
                строение
                2
                3
                й
                этаж
                главный
                офис
                C
                Android
                Bitrix
                NET
                DevOps
                Go
                iOS
                Java
                JavaScript
                PHP
                Python
                SDET
                ISO
                9001
                2015
                Close
                Осталось
                2000
                символов
                Прикрепите
                Расширения
                doc
                pdf
                xls
                jpg
                png
                docx
                xlsx
                архивы
                Максимальный
                размер
                файла
                10
                Мб
                прочитал
                Политику
                защиты
                обработки
                персональных
                согласен
                ней
                Отправить
                Спасибо
                Ваше
                сообщение
                отправлено
                обязательно
                ответим
                Вам
                ближайшее
                время""").split("\n",0);

        Assertions.assertDoesNotThrow((Executable) page::inOneCopyWords);
        Assertions.assertNotNull(page.inOneCopyWords());
        Assertions.assertArrayEquals(oneCopyWords,page.inOneCopyWords());
    }

    @Test
    void wordMatchCountGoogle() {

        HtmlTextParser page = new HtmlTextParser(Addresses.googleAddress);
        String word = page.words()[0];

        Assertions.assertDoesNotThrow(() -> {
            page.wordMatchCount(word);
        });
        Assertions.assertNotEquals(page.wordMatchCount(word),0);
    }
}