import {createBrowserRouter} from "react-router-dom";
import Login from "./views/login";
import Signup from "./views/signup";
import NotFound from "./views/NotFound";

const router = createBrowserRouter([
    {
        path: '/login',
        element: <Login />
    },
    {
        path: '/signup',
        element: <Signup />
    },
    {
        path: '/login',
        element: <Login />
    },
    {
        path: '/*',
        element: <NotFound />
    }
])

export default router;