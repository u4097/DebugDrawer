package io.palaima.debugdrawer.actions.models;

import android.view.View;
import android.widget.LinearLayout;

public interface Action {
    View getView(LinearLayout view);

    void onOpened();

    void onClosed();

    void onStart();

    void onStop();
}