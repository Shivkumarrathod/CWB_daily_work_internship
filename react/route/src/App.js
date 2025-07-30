import './App.css';
import Login from './Login'
import Garage from './Garage';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Login/>}/>
        <Route index element={<Login />} />
        <Route path='/login' element={<Login />} />
        <Route path="/garage" element={<Garage/>}/>
      </Routes>
    </BrowserRouter>
  );
}
 
export default App;
 