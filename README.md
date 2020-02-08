# Pushe for Android native

Simple implementation of [Pushe](http://pushe.co) SDK using Android studio and Java.

#### Run the example

* Install git if you don't have it.
* Run:
`git clone https://github.com/pusheco/android-studio-sample.git`
* Open it with Android studio and run it on your device.

#### Installation on your project
```groovy
dependencies {
   implementation 'co.pushe.plus:base:2.0.4' // Or compile for lower gradles
}

```
#### AndroidManifest.xml

Go to [Pushe console](https://console.pushe.co) and get the manifest content and add it to your project `AndroidManifest.xml`

The manifest content will be a tag like this:

```xml
<meta-data android:name="pushe_token"
            android:value="Y28ucm9uYXNoLnB1c2hlc2FtcGxlLmFzQHhpZkAxNTQ4OTc4MTg2Mjk=" />
```

The value `Y28ucm9uYXNoLnB1c2hlc2FtcGxlLmFzQHhpZkAxNTQ4OTc4MTg2Mjk=` is for demo panel. Replace it with your own token.

And if you need location-based features, add `Location permissions` to the manifest as well.


#### More features

All features are added to the sample. You can check them out.

Now run and install your app on a device or emulator that has google-play-service installed.
Pushe needs minimum android api=15 and google-play-service version >= 3 to run.

## More Info
For detailed documentations visit https://pushe.co/docs/android-studio/


## Contribution

Feel free to add anything you think is suitable to be in this sample.<br>
It does not follow any specific code style. So just read the code a little bit and send a pull request at anytime. We'll be happy :D.

## Support 
#### Email:
If you have any problem, please contact us using this email, we will get back to you right away:
`support [at] pushe.co`


