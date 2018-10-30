# react-native-mail-launcher

Launch mail app from react-native application

## Getting started

`$ npm install react-native-mail-launcher --save`

### Mostly automatic installation

`$ react-native link react-native-mail-launcher`

### Manual installation

#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-mail-launcher` and add `RNMailLauncher.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNMailLauncher.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`

- Add `import com.reactlibrary.RNMailLauncherPackage;` to the imports at the top of the file
- Add `new RNMailLauncherPackage()` to the list returned by the `getPackages()` method

2. Append the following lines to `android/settings.gradle`:
   ```
   include ':react-native-mail-launcher'
   project(':react-native-mail-launcher').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-mail-launcher/android')
   ```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
   ```
     compile project(':react-native-mail-launcher')
   ```

#### Windows

[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNMailLauncher.sln` in `node_modules/react-native-mail-launcher/windows/RNMailLauncher.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app

- Add `using Mail.Launcher.RNMailLauncher;` to the usings at the top of the file
- Add `new RNMailLauncherPackage()` to the `List<IReactPackage>` returned by the `Packages` method

## Usage

```javascript
import * as React from "react";
import { View, Button } from "react-native";
import launchMail from "react-native-mail-launcher";

export default class Example extends React.Component {
  openMail = () => {
    launchMail();
  };

  render() {
    return (
      <View>
        <Button onPress={this.openMail}>Go to mail client</Button>
      </View>
    );
  }
}
```
