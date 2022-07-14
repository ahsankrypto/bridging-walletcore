package com.testproject;

import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {


  final KonfettiView konfettiView = findViewById(R.id.konfettiView);
konfettiView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(final View view) {
      konfettiView.build()
              .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
              .setDirection(0.0, 359.0)
              .setSpeed(1f, 5f)
              .setFadeOutEnabled(true)
              .setTimeToLive(2000L)
              .addShapes(Shape.Square.INSTANCE, Shape.Circle.INSTANCE)
              .addSizes(new Size(12, 5f))
              .setPosition(-50f, konfettiView.getWidth() + 50f, -50f, -50f)
              .streamFor(300, 5000L);
    }
  });
  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "TestProject";
  }
}
