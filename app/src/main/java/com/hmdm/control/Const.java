package com.hmdm.control;

public class Const {
    public static final String LOG_TAG = "com.hmdm.Control";
    public static final int DEFAULT_BITRATE = 256000;
    public static final int DEFAULT_FRAME_RATE = 10;

    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_SHARING = 3;
    public static final int STATE_DISCONNECTING = 4;

    public static final int CONNECTION_TIMEOUT = 10000;

    public static final String EXTRA_EVENT = "event";

    public static final int SUCCESS = 0;
    public static final int NETWORK_ERROR = 1;
    public static final int SERVER_ERROR = 2;
}