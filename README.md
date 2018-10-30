# react-native-mail-launcher

Launch mail app from react-native application

## Getting started

`$ npm install react-native-mail-launcher --save`

### Mostly automatic installation

`$ react-native link react-native-mail-launcher`

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

#### iOS

We do not need a native module for iOS

## Usage

```javascript
import * as React from "react";
import { View, Button } from "react-native";
import launchMailApp from "react-native-mail-launcher";

export default class Example extends React.Component {
  openMail = () => {
    launchMailApp();
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
