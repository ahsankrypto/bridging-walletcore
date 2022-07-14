import Foundation

import WalletCore
import React


 @objc(EthWallet)

class EthWallet: NSObject, RCTBridgeModule{
  static func moduleName() -> String! {
    return "EthWallet";
  }
  static func requiresMainQueueSetup() -> Bool {
    return true;
  }
  
  @objc
  func GenerateEthWallet (_ resolve: RCTPromiseResolveBlock, rejecter reject: RCTPromiseRejectBlock) -> Void{
    let wallet = HDWallet(mnemonic: "increase essay wrong teach found slim picnic slow tornado crowd topic slow", passphrase: "")
    print("Mnemonic: ", wallet.mnemonic)
    
    // Ethereum example
    let coin: CoinType = .tron
    // Get the default address
    let addressEth = wallet.getAddressForCoin(coin: coin)
    print("Polkadot address: ", addressEth)
    resolve (addressEth);
  }
}
