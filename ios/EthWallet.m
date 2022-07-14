//
//  EthWallet.m
//  TestProject
//
//  Created by Macbook Pro on 11/03/2022.
//

#import <Foundation/Foundation.h>
#import <React/RCTBridgeModule.h>


//
@interface RCT_EXTERN_MODULE(EthWallet,NSObject)

RCT_EXTERN_METHOD(GenerateEthWallet: (RCTPromiseResolveBlock)resolve rejecter: (RCTPromiseRejectBlock)reject)

@end
@interface  RCT_EXTERN_MODULE(ViewController, UIViewController)
RCT_EXTERN_METHOD(touchesBegan: (Bool *) isRainingConfetti)


@end


