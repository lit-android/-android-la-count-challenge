## お題
### 1. カウントアプリの作成
- TextViewとButtonを配置してレイアウトを作ろう
- Buttonをタップした時に、カウントが増加する実装をしよう

| カウントアプリのレイアウト例 |
| ----- |
|<img width="200" alt="1" src="https://user-images.githubusercontent.com/50792596/153572043-2f9774b6-b128-4568-b68f-266ed412a439.png">|

### 2. 文字の色を変えよう
- コードからTextViewの文字の色を変化させる方法を調べよう
- when文を使って数が奇数の時に赤色にしてみよう
- when文を使って数が偶数の時に青色にしてみよう

| 偶数の時の例 |
| ----- |
|<img width="200" alt="2" src="https://user-images.githubusercontent.com/50792596/153571793-99d15489-b7f9-4356-b4e2-accb5b41d88e.png">|

### 3. 何をカウントしているかわかるようにしよう
- EditTextを配置しよう
- EditTextに文字を入力してみよう

| レイアウト例 | 入力時 |
| ----- | ----- |
|<img width="200" alt="3_1" src="https://user-images.githubusercontent.com/50792596/153572206-87b28842-0893-4f7d-8e90-cde45d6996c8.png">|<img width="200" alt="3_2" src="https://user-images.githubusercontent.com/50792596/153572219-61e8504d-9dcb-4941-a69a-24aa8d9bdf35.png">|

### 4. 音が鳴るようにしよう
- SoundPoolを使ってsound.oggの音源を再生できるようにしよう
  - 音源のリンク: https://maou.audio/category/se/se-system/page/2/
  - システム39などをogg形式でダウンロードしよう 
- カウントが奇数の時に音を鳴らしてみよう 

### 5. カウントした値を保存できるようにしよう
- SharedPreferencesを調べてみよう
  - 参考: [Key-Value データを保存する](https://developer.android.com/training/data-storage/shared-preferences)
  - 参考: [【入門】SharedPreferences](https://qiita.com/haramiso/items/63b74aa07027fa82bb96)
- SharedPreferencesを使ってcountというkeyでカウントした値を保存しよう
- アプリが起動した時にSharedPreferencesからデータを読み取り、アプリが終了した時にSharedPreferencesにデータを書き込もう

### 6. タイトル画面を作ろう
- TitleActivityを作ろう
- アプリを開いた時にTitleActivityが呼び出されるようにしよう
  - AndroidManifest.xmlを編集して起動時に開かれるアクティビティをTitleActivityに変更しよう
- TitleActivityからMainActivityへ遷移できるようにしよう

| タイトル画面のレイアウト例 |
| ----- |
|<img width="200" alt="6" src="https://user-images.githubusercontent.com/50792596/153572448-cb5b1100-cc0c-4ca3-9ad3-5888bd2a363d.png">|

### 7. タイトル画面にアニメーションを追加しよう
- Lottieを導入してみよう
  - build.gradle(:app)にLottieの依存関係を追加しよう
  - 参考: https://github.com/airbnb/lottie-android
- LottieAnimationViewを配置してアニメーションを表示させよう
  - アニメーション素材はres>rawに入っているandroid.jsonを使おう

| タイトル画面のレイアウト例 |
| ----- |
|<img width="200" alt="7" src="https://user-images.githubusercontent.com/50792596/153572614-58576441-3012-48d9-a39c-737c98900240.png">|

### 8. チュートリアル画面を追加しよう
- FirstFragment、SecondFragment、ThirdFragmentをプロジェクトに追加しよう
- 作成したFragmentにTextViewを配置し、それぞれに1、2、3を表示させよう
- ThirdFragmentにTitleActivityに遷移するためのボタンを配置しよう
- ViewPager2を使用して、作成した3つのFragmentを横方向に遷移させてみよう
- SharedPreferencesを使って、チュートリアル画面は初回起動時のみに表示されるようにしてみよう

| FirstFragment | ThirdFragment |
| ----- | ----- |
|<img width="200" alt="8_1" src="https://user-images.githubusercontent.com/50792596/153572719-115b2c9b-6354-4f49-9968-fece5cf7894d.png">|<img width="200" alt="8_2" src="https://user-images.githubusercontent.com/50792596/153572732-3091882b-0241-4057-ae36-d84c22267d70.png">|
