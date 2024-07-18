package exercise;

import io.javalin.Javalin;

public final class App {

    public static Javalin getApp() {

        // BEGIN
	       Javalin app = Javalin.create();

        // Обработчик GET /phones
        app.get("/phones", ctx -> {
            // Получаем список телефонов
            List<String> phones = Data.getPhones();

            // Преобразуем список телефонов в JSON вручную
            StringBuilder phonesJson = new StringBuilder("[");
            for (int i = 0; i < phones.size(); i++) {
                phonesJson.append("\"").append(phones.get(i)).append("\"");
                if (i < phones.size() - 1) {
                    phonesJson.append(",");
                }
            }
            phonesJson.append("]");

            // Отправляем ответ в формате JSON
            ctx.contentType("application/json");
            ctx.result(phonesJson.toString());
        });

        // Обработчик GET /domains
        app.get("/domains", ctx -> {
            // Получаем список доменных имен
            List<String> domains = Data.getDomains();

            // Преобразуем список доменов в JSON вручную (аналогично телефонам)
            StringBuilder domainsJson = new StringBuilder("[");
            for (int i = 0; i < domains.size(); i++) {
                domainsJson.append("\"").append(domains.get(i)).append("\"");
                if (i < domains.size() - 1) {
                    domainsJson.append(",");
                }
            }
            domainsJson.append("]");

            // Отправляем ответ в формате JSON
            ctx.contentType("application/json");
            ctx.result(domainsJson.toString());
        });

        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
