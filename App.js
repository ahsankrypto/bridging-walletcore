import React from 'react';

import {
  Platform,
  SafeAreaView,
  NativeModules,
  Text,
  TouchableOpacity,
} from 'react-native';

// const TestNativeModule = NativeModules.EthWallet;
// const TestNativeModuleIos = NativeModules.EthWallet;
const TestConfetti = NativeModules.ViewController;

const onPressClick = async () => {
  if (Platform.OS == 'ios') {
    const walletEthIos = await TestConfetti.touchesBegan();
    // console.log('walletEthIos', walletEthIos);
  } else {
    const walletEth = await TestNativeModule.EthWalletModule();
    console.log('check', walletEth);
  }
};
const App = () => {
  return (
    <SafeAreaView
      style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
      <TouchableOpacity
        style={{borderWidth: 1, padding: 10, backgroundColor: 'red'}}
        onPress={onPressClick}>
        <Text>Hello World</Text>
      </TouchableOpacity>
    </SafeAreaView>
  );
};

export default App;
