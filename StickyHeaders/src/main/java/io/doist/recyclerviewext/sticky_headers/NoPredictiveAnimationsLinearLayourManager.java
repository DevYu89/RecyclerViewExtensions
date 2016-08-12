package io.doist.recyclerviewext.sticky_headers;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

public class NoPredictiveAnimationsLinearLayourManager extends LinearLayoutManager {
    public NoPredictiveAnimationsLinearLayourManager(Context context) {
        super(context);
    }

    public NoPredictiveAnimationsLinearLayourManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    @Override
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
