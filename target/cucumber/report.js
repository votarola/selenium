$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PagoWebPayMall.feature");
formatter.feature({
  "line": 2,
  "name": "PagoWebPayMall",
  "description": "",
  "id": "pagowebpaymall",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@PagoWebPayMall"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "PagoWebPayMall",
  "description": "",
  "id": "pagowebpaymall;pagowebpaymall",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "quiero realizar un pago por webpay mall",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "ingreso los montos y pago con \u003ctarjeta\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "se realiza el pago",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "pagowebpaymall;pagowebpaymall;",
  "rows": [
    {
      "cells": [
        "tarjeta"
      ],
      "line": 10,
      "id": "pagowebpaymall;pagowebpaymall;;1"
    },
    {
      "cells": [
        "\"377826100086878\""
      ],
      "line": 11,
      "id": "pagowebpaymall;pagowebpaymall;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "PagoWebPayMall",
  "description": "",
  "id": "pagowebpaymall;pagowebpaymall;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@PagoWebPayMall"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "quiero realizar un pago por webpay mall",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "ingreso los montos y pago con \"377826100086878\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "se realiza el pago",
  "keyword": "Then "
});
formatter.match({
  "location": "Def_PagoWebPay.quiero_realizar_un_pago_por_webpay_mall()"
});
formatter.result({
  "duration": 4642812831,
  "error_message": "org.openqa.selenium.WebDriverException: It is impossible to create a new session because \u0027createSession\u0027 which takes HttpClient, InputStream and long was not found or it is not accessible\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CL-NB-530\u0027, ip: \u0027192.168.168.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: driver.version: AppiumDriver\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor$1.createSession(AppiumCommandExecutor.java:195)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.createSession(AppiumCommandExecutor.java:209)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:231)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.\u003cinit\u003e(DefaultGenericMobileDriver.java:38)\r\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:84)\r\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:94)\r\n\tat utils.Applicationlauncher.setUp(Applicationlauncher.java:26)\r\n\tat definitions.Def_PagoWebPay.quiero_realizar_un_pago_por_webpay_mall(Def_PagoWebPay.java:37)\r\n\tat ✽.Given quiero realizar un pago por webpay mall(PagoWebPayMall.feature:5)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor$1.createSession(AppiumCommandExecutor.java:185)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.createSession(AppiumCommandExecutor.java:209)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:231)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.\u003cinit\u003e(DefaultGenericMobileDriver.java:38)\r\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:84)\r\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:94)\r\n\tat utils.Applicationlauncher.setUp(Applicationlauncher.java:26)\r\n\tat definitions.Def_PagoWebPay.quiero_realizar_un_pago_por_webpay_mall(Def_PagoWebPay.java:37)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\r\nCaused by: org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: Error executing adbExec. Original error: \u0027Command \u0027C:\\\\Users\\\\Victor.Otarola\\\\AppData\\\\Local\\\\Android\\\\Sdk\\\\platform-tools\\\\adb.exe -P 5037 -s db3cb419 shell settings delete global hidden_api_policy_pre_p_apps\u0027 exited with code 255\u0027; Stderr: \u0027Security exception: Permission denial: writing to settings requires:android.permission.WRITE_SECURE_SETTINGS\r\n\r\njava.lang.SecurityException: Permission denial: writing to settings requires:android.permission.WRITE_SECURE_SETTINGS\r\n\tat com.android.providers.settings.SettingsProvider.enforceWritePermission(SettingsProvider.java:2050)\r\n\tat com.android.providers.settings.SettingsProvider.mutateGlobalSetting(SettingsProvider.java:1256)\r\n\tat com.android.providers.settings.SettingsProvider.deleteGlobalSetting(SettingsProvider.java:1239)\r\n\tat com.android.providers.settings.SettingsProvider.call(SettingsProvider.java:476)\r\n\tat android.content.ContentProvider.call(ContentProvider.java:2161)\r\n\tat android.content.ContentProvider$Transport.call(ContentProvider.java:477)\r\n\tat com.android.providers.settings.SettingsService$MyShellCommand.deleteForUser(SettingsService.java:399)\r\n\tat com.android.providers.settings.SettingsService$MyShellCommand.onCommand(SettingsService.java:281)\r\n\tat android.os.ShellCommand.exec(ShellCommand.java:104)\r\n\tat com.android.providers.settings.SettingsService.onShellCommand(SettingsService.java:49)\r\n\tat android.os.Binder.shellCommand(Binder.java:881)\r\n\tat android.os.Binder.onTransact(Binder.java:765)\r\n\tat android.os.Binder.execTransactInternal(Binder.java:1021)\r\n\tat android.os.Binder.execTransact(Binder.java:994)\u0027; Code: \u0027255\u0027\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CL-NB-530\u0027, ip: \u0027192.168.168.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: driver.version: AppiumDriver\nremote stacktrace: UnknownError: An unknown server-side error occurred while processing the command. Original error: Error executing adbExec. Original error: \u0027Command \u0027C:\\\\Users\\\\Victor.Otarola\\\\AppData\\\\Local\\\\Android\\\\Sdk\\\\platform-tools\\\\adb.exe -P 5037 -s db3cb419 shell settings delete global hidden_api_policy_pre_p_apps\u0027 exited with code 255\u0027; Stderr: \u0027Security exception: Permission denial: writing to settings requires:android.permission.WRITE_SECURE_SETTINGS\r\n\r\njava.lang.SecurityException: Permission denial: writing to settings requires:android.permission.WRITE_SECURE_SETTINGS\r\n\tat com.android.providers.settings.SettingsProvider.enforceWritePermission(SettingsProvider.java:2050)\r\n\tat com.android.providers.settings.SettingsProvider.mutateGlobalSetting(SettingsProvider.java:1256)\r\n\tat com.android.providers.settings.SettingsProvider.deleteGlobalSetting(SettingsProvider.java:1239)\r\n\tat com.android.providers.settings.SettingsProvider.call(SettingsProvider.java:476)\r\n\tat android.content.ContentProvider.call(ContentProvider.java:2161)\r\n\tat android.content.ContentProvider$Transport.call(ContentProvider.java:477)\r\n\tat com.android.providers.settings.SettingsService$MyShellCommand.deleteForUser(SettingsService.java:399)\r\n\tat com.android.providers.settings.SettingsService$MyShellCommand.onCommand(SettingsService.java:281)\r\n\tat android.os.ShellCommand.exec(ShellCommand.java:104)\r\n\tat com.android.providers.settings.SettingsService.onShellCommand(SettingsService.java:49)\r\n\tat android.os.Binder.shellCommand(Binder.java:881)\r\n\tat android.os.Binder.onTransact(Binder.java:765)\r\n\tat android.os.Binder.execTransactInternal(Binder.java:1021)\r\n\tat android.os.Binder.execTransact(Binder.java:994)\u0027; Code: \u0027255\u0027\n    at getResponseForW3CError (C:\\Users\\Victor.Otarola\\AppData\\Roaming\\npm\\node_modules\\appium\\node_modules\\appium-base-driver\\lib\\protocol\\errors.js:804:9)\n    at asyncHandler (C:\\Users\\Victor.Otarola\\AppData\\Roaming\\npm\\node_modules\\appium\\node_modules\\appium-base-driver\\lib\\protocol\\protocol.js:388:37)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:499)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:486)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\t... 74 more\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "377826100086878",
      "offset": 31
    }
  ],
  "location": "Def_PagoWebPay.ingreso_los_montos_y_pago_con(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Def_PagoWebPay.se_realiza_el_pago()"
});
formatter.result({
  "status": "skipped"
});
});