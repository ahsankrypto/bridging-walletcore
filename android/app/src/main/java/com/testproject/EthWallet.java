package com.testproject;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.protobuf.ByteString;

import java.math.BigInteger;

import wallet.core.java.AnySigner;
import wallet.core.jni.CoinType;
import wallet.core.jni.HDWallet;
import wallet.core.jni.PrivateKey;
import wallet.core.jni.proto.Ethereum;


public class EthWallet extends ReactContextBaseJavaModule {
    static {
        System.loadLibrary("TrustWalletCore");
    }

    String seedPhrase = "ripple scissors kick mammal hire column oak again sun offer wealth tomorrow wagon turn fatal";
    // String passphrase = "";

    private static ReactApplicationContext reactContext;

    EthWallet(ReactApplicationContext context) {

        super(context);

        reactContext = context;
        this.EthWalletModule();
    }


    @Override
    public String getName() {
        return "EthWallet";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String EthWalletModule() {
//        try {

            HDWallet wallet = new HDWallet(seedPhrase, "");
            CoinType coinEth = CoinType.ETHEREUM;
            String addressEth = wallet.getAddressForCoin(coinEth);
            // Signing a transaction (using EthereumSigner)
            PrivateKey secretPrivateKey = wallet.getKeyForCoin(coinEth);
            String dummyReceiverAddress = "0xC37054b3b48C3317082E7ba872d7753D13da4986";

//            Ethereum.SigningInput signerInput = Ethereum.SigningInput.newBuilder()
//                    .setChainId(ByteString.copyFrom(new BigInteger("01").toByteArray()))
//                    .setGasPrice(ByteString.copyFromUtf8(new BigInteger("d693a400", 16).toString()))
//                    .setGasLimit(ByteString.copyFromUtf8(new BigInteger("5208", 16).toString()))
//                    .setToAddress(dummyReceiverAddress)
//                    .setTransaction(Ethereum.Transaction
//                            .newBuilder().setTransfer(Ethereum.Transaction.Transfer
//                                    .newBuilder().setAmount(ByteString.copyFromUtf8(new BigInteger("0348bca5a16000", 16).toString())).build())
//                            .build())
//                    .setPrivateKey(ByteString.copyFrom(secretPrivateKey.data()))
//                    .build();
//
//
//            Ethereum.SigningOutput output = AnySigner.sign(signerInput, CoinType.ETHEREUM, Ethereum.SigningOutput.parser());
//            Log.d(output.toString(), "Hello world");
            Log.d(addressEth, "address Eth");
            Log.d(String.valueOf(secretPrivateKey), "Eth private key");
            return addressEth;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }


}
