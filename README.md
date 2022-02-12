## お題
### 1. カウントアプリを作成しよう
- TextViewとButtonを配置してレイアウトを作ろう
- Buttonをタップした時に、カウントが増加する実装をしよう

| カウントアプリのレイアウト例 |
| ----- |
|<img width="200" alt="1" src="https://user-images.githubusercontent.com/50792596/153572043-2f9774b6-b128-4568-b68f-266ed412a439.png">|

### 2. カウントの値に応じて文字の色を変えよう
- Kotlinファイルから動的に、TextViewの文字の色を変化させる方法を調べよう
- whenを使って、カウントの値が奇数の時に赤色にしてみよう
- whenを使って、カウントの値が偶数の時に青色にしてみよう

| 偶数の時の例 |
| ----- |
|<img width="200" alt="2" src="https://user-images.githubusercontent.com/50792596/153571793-99d15489-b7f9-4356-b4e2-accb5b41d88e.png">|

### 3. カウントの値に題名をつけよう
- EditTextを配置しよう
- EditTextに「今日のお昼ご飯」を入力してみよう

| レイアウト例 | 入力時 |
| ----- | ----- |
|<img width="200" alt="3_1" src="https://user-images.githubusercontent.com/50792596/153572206-87b28842-0893-4f7d-8e90-cde45d6996c8.png">|<img width="200" alt="3_2" src="https://user-images.githubusercontent.com/50792596/153572219-61e8504d-9dcb-4941-a69a-24aa8d9bdf35.png">|

### 4. 効果音をつけよう
- 音源のリンクから「システム39」をogg形式でダウンロードしよう
  - 音源のリンク: https://maou.audio/category/se/se-system/page/2/
- SoundPoolを使ってボタンを押した時にsound.oggの音源を再生するようにしよう
- カウントの値が奇数の時に音源を再生するようにしよう

### 5. カウントの値を保存できるようにしよう
- SharedPreferencesについて調べてみよう
  - 参考: [Key-Value データを保存する](https://developer.android.com/training/data-storage/shared-preferences)
- アプリが終了した時に、"COUNT"というキーでカウントした値を保存しよう
  - 参考： [アクティビティのライフサイクルについて](https://developer.android.com/guide/components/activities/activity-lifecycle?hl=ja)
- アプリが起動した時に、"COUNT"というキーで保存した値を取得し、TextViewに表示させよう

### 6. タイトル画面を作成しよう
- TitleActivityを作成しよう
- AndroidManifest.xmlを編集して、アプリを起動した時にTitleActivityが呼び出されるようにしよう
- Buttonを押した時に、TitleActivityからMainActivityへ遷移するようにしよう

| タイトル画面のレイアウト例 |
| ----- |
|<img width="200" alt="6" src="https://user-images.githubusercontent.com/50792596/153572448-cb5b1100-cc0c-4ca3-9ad3-5888bd2a363d.png">|

### 7. タイトル画面にアニメーションを追加しよう
- アニメーションのリンクから「Android logo」をjson形式でダウンロードしよう
  - アニメーションのリンク： https://lottiefiles.com/30350-android-logo
- resディレクトリにrawディレクトリを作成して、アニメーション素材をそこに追加しよう
- アプリモジュールのbuild.gradle(:app)にLottieの依存関係を追加しよう
  - 参考: https://github.com/airbnb/lottie-android
- LottieAnimationViewを配置して、アニメーションを表示させよう

| タイトル画面のレイアウト例 |
| ----- |
|<img width="200" alt="7" src="https://user-images.githubusercontent.com/50792596/153572614-58576441-3012-48d9-a39c-737c98900240.png">|

### 8. チュートリアル画面を追加しよう
- TutorialActivity、FirstFragment、SecondFragment、ThirdFragmentをプロジェクトに追加しよう
- 作成したFragmentにTextViewを配置し、それぞれに1、2、3を表示しよう
- ThirdFragmentにButtonを配置し、ボタンを押したらTutorialActivityを終了できるようにしよう
- ViewPager2を使用して、作成した3つのFragmentを横方向にスワイプできるようにしよう
- SharedPreferencesを使用して、チュートリアル画面は初回起動時にのみ表示させるようにしよう

| FirstFragment | ThirdFragment |
| ----- | ----- |
|<img width="200" alt="8_1" src="https://user-images.githubusercontent.com/50792596/153572719-115b2c9b-6354-4f49-9968-fece5cf7894d.png">|<img width="200" alt="8_2" src="https://user-images.githubusercontent.com/50792596/153572732-3091882b-0241-4057-ae36-d84c22267d70.png">|
