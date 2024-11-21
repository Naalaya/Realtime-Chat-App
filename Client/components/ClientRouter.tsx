import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import SignIn from "../app/signin/page";
import SignUp from "../app/signup/page";

export default function ClientRouter() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<SignIn />} />
        <Route path="/signin" element={<SignIn />} />
        <Route path="/signup" element={<SignUp />} />
      </Routes>
    </Router>
  );
}