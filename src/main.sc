<aiml version="1.0.1" encoding="UTF-8">

  <!-- ===================== -->
  <!-- /hello -->
  <!-- ===================== -->
  <category>
    <pattern>/HELLO</pattern>
    <template>Привет! Я бот-помощник. Могу подсказать погоду и курс валют. Напишите: погода или курс валют.</template>
  </category>

  <category>
    <pattern>ПРИВЕТ *</pattern>
    <template>Привет! Могу рассказать про погоду и курс валют. Что интересует?</template>
  </category>
  <category>
    <pattern>ЗДРАВСТВУЙ *</pattern>
    <template>Привет! Могу рассказать про погоду и курс валют. Что интересует?</template>
  </category>
  <category>
    <pattern>ЗДРАВСТВУЙТЕ *</pattern>
    <template>Привет! Могу рассказать про погоду и курс валют. Что интересует?</template>
  </category>
  <category>
    <pattern>ДОБРЫЙ ДЕНЬ *</pattern>
    <template>Здравствуйте! Могу подсказать погоду и курс валют. Что нужно?</template>
  </category>
  <category>
    <pattern>HELLO *</pattern>
    <template>Hello! I can help with weather and currency rates. Write: weather or currency.</template>
  </category>

  <!-- ===================== -->
  <!-- /weather -->
  <!-- ===================== -->
  <category>
    <pattern>/WEATHER</pattern>
    <template>Погоду для какого города подсказать? Например: Рига.</template>
  </category>

  <category>
    <pattern>ПОГОДА *</pattern>
    <template>Погоду для какого города подсказать? Например: Рига.</template>
  </category>
  <category>
    <pattern>ПРОГНОЗ *</pattern>
    <template>Погоду для какого города подсказать? Например: Рига.</template>
  </category>
  <category>
    <pattern>ТЕМПЕРАТУРА *</pattern>
    <template>Погоду для какого города подсказать? Например: Рига.</template>
  </category>
  <category>
    <pattern>ДОЖДЬ *</pattern>
    <template>Погоду для какого города подсказать? Например: Рига.</template>
  </category>
  <category>
    <pattern>СНЕГ *</pattern>
    <template>Погоду для какого города подсказать? Например: Рига.</template>
  </category>

  <!-- ===================== -->
  <!-- /currency -->
  <!-- ===================== -->
  <category>
    <pattern>/CURRENCY</pattern>
    <template>Какую валюту показать? Например: USD или EUR. Можно написать: курс доллара.</template>
  </category>

  <category>
    <pattern>КУРС *</pattern>
    <template>Про какую валюту? USD или EUR?</template>
  </category>
  <category>
    <pattern>ВАЛЮТА *</pattern>
    <template>Про какую валюту? USD или EUR?</template>
  </category>
  <category>
    <pattern>ДОЛЛАР *</pattern>
    <template>Понял. Курс USD интересует. Уточните: к RUB или к EUR?</template>
  </category>
  <category>
    <pattern>USD *</pattern>
    <template>Понял. Курс USD интересует. Уточните: к RUB или к EUR?</template>
  </category>
  <category>
    <pattern>ЕВРО *</pattern>
    <template>Понял. Курс EUR интересует. Уточните: к RUB или к USD?</template>
  </category>
  <category>
    <pattern>EUR *</pattern>
    <template>Понял. Курс EUR интересует. Уточните: к RUB или к USD?</template>
  </category>

  <!-- ===================== -->
  <!-- /NoMatch (fallback) -->
  <!-- ===================== -->
  <category>
    <pattern>*</pattern>
    <template>Я могу помочь с погодой и курсом валют. Напишите: погода или курс валют. Также можно /hello.</template>
  </category>

</aiml>
