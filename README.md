## お題
### 1. カウントアプリの作成
- TextViewとButtonを配置してレイアウトを作ろう
- Buttonをタップした時に、カウントが増加する実装をしよう

### 2. 文字の色を変えよう
- コードからTextViewの文字の色を変化させる方法を調べよう
- when文を使って数が奇数の時に赤色にしてみよう
- when文を使って数が偶数の時に青色にしてみよう

### 3. 何をカウントしているかわかるようにしよう
- EditTextを配置しよう
- EditTextに文字を入力してみよう

### 4. 音が鳴るようにしよう
- SoundPoolを使ってsound.oggの音源を再生できるようにしよう
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
  - AndroidManifest.xmlを編集して起動時に開かれるアクティビティを指定しよう
- TitleActivityからMainActivityへ遷移できるようにしよう

### 7. タイトル画面にアニメーションを追加しよう
- Lottieを導入してみよう
  - build.gradle(:app)にLottieの依存関係を追加しよう
  - 参考: https://github.com/airbnb/lottie-android
- LottieAnimationViewを配置してアニメーションを表示させよう

### 8. チュートリアル画面を追加しよう
- FirstFragment、SecondFragment、ThirdFragmentをプロジェクトに追加しよう
- 作成したFragmentにTextViewを配置し、それぞれに1、2、3を表示させよう
- ThirdFragmentにTitleActivityに遷移するためのボタンを配置しよう
- ViewPager2を使用して、作成した3つのFragmentを遷移させてみよう
- SharedPreferencesを使って、チュートリアル画面は初回起動時のみに表示されるようにしてみよう
