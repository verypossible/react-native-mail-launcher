import { NativeModules, Platform, Linking } from "react-native";

const { RNMailLauncher } = NativeModules;

export default function launch() {
  if (Platform.OS === "android") {
    RNMailLauncher.launchMailApp();
    return;
  }

  Linking.openURL("message:0");
}
