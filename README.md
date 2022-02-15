# EPAMCourse
Task Arrays Part I

part 1 ➢ Создать класс Массив. ➢ Разработать service-классы реализующие функциональности: • поиск min\max значения массива, • замену элементов массива по условию, • определение среднего значения элементов массива, • определение суммы элементов массива, • определение числа положительных\отрицательных элементов массива.

part 2 ➢ Сортировка массива тремя различными алгоритмами. ➢ Параметры, необходимые для создания массивов, получить чтением информации из файла (.txt). Часть данных должна быть некорректной. Если встретилась некорректная строка, приложение должно переходить к следующей строке. Чтение может быть прекращено по достижении первой корректной строки. Файл данных должен находиться в отдельном каталоге. ➢ Для чтения из файла можно использовать методы, появившиеся в Java8. ➢ Использовать собственные классы исключительных ситуаций. ➢ Разработать validation-классы для валидации исходных данных при создании массивов. Например: корректная строка в файле для создания массива: «1, 2, 3» или «1 – 2 - 3» или «3 4 7»; Некорректная строка в файле для создания массива: «1z1 21 32». Присутствует недопустимый символ «z», следовательно всю строку следует считать некорректной.

part 3 Решить задачи, поставленные в part 1 и 2, с помощью возможностей IntStream.

Task Arrays Part II Необходимо разработать приложение и тесты к нему согласно требованиям, приведенным ниже. В приложении должна быть реализована функциональность, определенная заданием.

Требования ➢ Класс, содержащий массив, должен обьявлять поле id или name. ➢ Все созданные объекты массивов сохранить в объекте-репозитории. Паттерн Repository. ➢ Разработать спецификации по поиску объектов и групп объектов в репозитории. По ID(по имени) по элементам, например: найти все массивы, сумма(среднее значение, max, min, количество) элементов которых больше\меньше\равно заданного. ➢ Разработать методы по добавлению, удалению объектов репозитория. ➢ Разработать методы сортировки наборов объектов по ID, по имени, по первому элементу, по числу элементов и т д. Использовать интерфейс Comparator. ➢ Средние значения, max и min значения должны храниться в объекте класса-Warehouse. ➢ Любое изменение любого элемента массива должно вызывать пересчет соответствующих значений в классе Warehouse. ➢ Для решения данной задачи использовать паттерны Observer и Singleton (для warehouse и repository; потокобезопасные варианты использовать запрещено).
