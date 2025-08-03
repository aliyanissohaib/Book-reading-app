# 📚 Offline Reading App

An Android application that provides a seamless offline reading experience for pre-stored books and documents. Read your favorite books anytime, anywhere without internet connectivity.

## 📖 Description

This offline reading app is designed for book lovers who want to enjoy their reading without depending on internet connectivity. The app comes with pre-loaded books stored locally on the device, ensuring fast access and uninterrupted reading sessions. Built natively for Android using Java in Android Studio.

## ✨ Features

- **📱 Offline Reading**: Access all books without internet connection
- **📖 Pre-loaded Content**: Books are stored locally within the app
- **🎨 Clean UI**: User-friendly interface for comfortable reading
- **📑 Page Navigation**: Easy page turning and chapter navigation
- **🔖 Bookmark Support**: Save your reading progress
- **🌙 Reading Modes**: Light and dark themes for different environments
- **📏 Text Customization**: Adjustable font size and line spacing
- **📚 Library Management**: Organized book collection with categories
- **🔍 Search Function**: Find specific content within books
- **📊 Reading Progress**: Track reading completion percentage

## 🛠️ Technical Stack

- **Language**: Java
- **IDE**: Android Studio
- **Platform**: Android (API Level 21+)
- **Database**: SQLite for book metadata
- **File Format**: PDF/TXT/EPUB support
- **Architecture**: MVVM pattern

## 📋 Prerequisites

- Android Studio Arctic Fox (2020.3.1) or later
- Android SDK API Level 21 (Android 5.0) or higher
- Java Development Kit (JDK) 8 or higher
- Gradle 7.0+

## 🚀 Installation & Setup

1. Clone the repository:
```bash
git clone https://github.com/aliyanissohaib/Book-reading-app.git
cd offline-reading-app
```

2. Open the project in Android Studio:
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned repository folder

3. Sync project with Gradle files:
   - Wait for Gradle sync to complete
   - Resolve any dependency issues if prompted

4. Build and run:
   - Connect an Android device or start an emulator
   - Click the "Run" button or press `Shift + F10`

## 📱 App Structure

```
app/
├── src/main/
│   ├── java/com/yourpackage/
│   │   ├── activities/          # Main activities
│   │   ├── adapters/           # RecyclerView adapters
│   │   ├── models/             # Data models
│   │   ├── database/           # SQLite helper classes
│   │   ├── utils/              # Utility classes
│   │   └── fragments/          # UI fragments
│   ├── res/
│   │   ├── layout/             # XML layouts
│   │   ├── values/             # Colors, strings, styles
│   │   ├── drawable/           # Images and icons
│   │   └── menu/               # Menu resources
│   └── assets/
│       └── books/              # Pre-stored book files
```

## 🎯 Key Components

- **MainActivity**: Main hub with book library
- **ReadingActivity**: Core reading interface
- **BookAdapter**: Manages book list display
- **DatabaseHelper**: Handles local data storage
- **BookParser**: Processes different file formats
- **SettingsManager**: Manages user preferences

## 📖 Usage

1. **Launch the App**: Open the app to see your book library
2. **Select a Book**: Tap on any book to start reading
3. **Navigate Pages**: Swipe left/right or use navigation buttons
4. **Customize Reading**: Access settings to adjust font size, theme, etc.
5. **Bookmark Pages**: Tap bookmark icon to save your progress
6. **Search Content**: Use search functionality to find specific text

## 🎨 Customization

### Adding New Books
1. Place book files in `app/src/main/assets/books/`
2. Update the database with book metadata
3. Rebuild the app

### Modifying Themes
- Edit colors in `res/values/colors.xml`
- Modify styles in `res/values/styles.xml`

### Changing Fonts
- Add font files to `res/font/` directory
- Update font references in layouts

## 🤝 Contributing

Contributions are welcome! Here are ways you can help:

- 🐛 Report bugs and issues
- 💡 Suggest new features
- 🎨 Improve UI/UX design
- 📚 Add support for more file formats
- 🔧 Optimize performance
- 📝 Improve documentation

### Development Guidelines
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 🔧 Build Requirements

```gradle
android {
    compileSdkVersion 33
    defaultConfig {
        applicationId "com.yourpackage.offlinereader"
        minSdkVersion 21
        targetSdkVersion 33
        versionCode 1
        versionName "1.0"
    }
}

dependencies {
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'androidx.recyclerview:recyclerview:1.3.0'
    implementation 'com.google.android.material:material:1.8.0'
    // Add other dependencies as needed
}
```

## 🚀 Future Enhancements

- 📱 Tablet optimization
- 🎵 Audio book support
- ☁️ Cloud sync for bookmarks
- 📊 Reading statistics
- 🌍 Multi-language support
- 📝 Note-taking features
- 🔊 Text-to-speech functionality

## 🐛 Known Issues

- Large PDF files may take longer to load
- EPUB files require additional parsing optimization

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Support

If you encounter any issues or have questions:
- Create an issue on GitHub
- Check the documentation in the `docs/` folder
- Review existing issues for solutions

## 🏷️ Tags

`android` `java` `android-studio` `offline-reading` `ebook-reader` `mobile-app` `book-reader` `offline-app` `reading-app` `android-development`

---

*Happy Reading! 📖✨*
